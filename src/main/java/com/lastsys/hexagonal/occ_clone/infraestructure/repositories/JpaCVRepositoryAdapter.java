package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.CV;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.cv.CVRepositoryPort;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.CVEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaCVRepositoryAdapter implements CVRepositoryPort {
    private final JpaCVRepository jpaCVRepository;
    private final JpaUserRepository jpaUserRepository;

    public JpaCVRepositoryAdapter(
            JpaCVRepository jpaCVRepository,
            JpaUserRepository jpaUserRepository
    ){
        this.jpaCVRepository = jpaCVRepository;
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public CV save(CV cv) {
        UserEntity userEntity = jpaUserRepository.findById(cv.getIdApplicant())
                .orElseThrow(()-> new RuntimeException("Applicant not found"));
        CVEntity cvEntity =  CVEntity.fromDomainModel(cv, userEntity);
        CVEntity saveCVEntity = jpaCVRepository.save(cvEntity);
        return saveCVEntity.toDomainModel();
    }

    @Override
    public Optional<CV> findById(Long id) {
        return jpaCVRepository.findById(id)
                .map(CVEntity::toDomainModel);
    }

    @Override
    public List<CV> findAll() {
        return jpaCVRepository.findAll()
                .stream().map(CVEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CV> update(CV cv) {
        if(jpaCVRepository.existsById(cv.getId())){
            UserEntity userEntity = jpaUserRepository.findById(cv.getIdApplicant())
                    .orElseThrow(()-> new RuntimeException("Applicant not found"));

            CVEntity cvEntity = CVEntity.fromDomainModel(cv, userEntity);
            CVEntity udpateCVEntity = jpaCVRepository.save(cvEntity);
            return Optional.of(udpateCVEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaCVRepository.existsById(id)){
            jpaCVRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
