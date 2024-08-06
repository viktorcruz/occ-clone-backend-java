package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.Education;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.education.EducationRepositoryPort;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.CVEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.EducationEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaEducationRepositoryAdapter implements EducationRepositoryPort {
    private final JpaEducationRepository jpaEducationRepository;
    private final JpaCVRepository jpaCVRepository;

    public JpaEducationRepositoryAdapter(
            JpaEducationRepository jpaEducationRepository,
            JpaCVRepository jpaCVRepository
    ) {
        this.jpaCVRepository = jpaCVRepository;
        this.jpaEducationRepository = jpaEducationRepository;
    }

    @Override
    public Education save(Education education) {
        CVEntity cvEntity = jpaCVRepository.findById(education.getIdCv()).orElseThrow(() -> new RuntimeException("CV not found"));

        EducationEntity educationEntity = EducationEntity.fromDomainModel(education, cvEntity);
        EducationEntity saveEducationEntity = jpaEducationRepository.save(educationEntity);
        return saveEducationEntity.toDomainModel();
    }

    @Override
    public Optional<Education> findById(Long id) {
        return jpaEducationRepository.findById(id)
                .map(EducationEntity::toDomainModel);
    }

    @Override
    public List<Education> findAll() {
        return jpaEducationRepository.findAll()
                .stream().map(EducationEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Education> update(Education education) {
        if (jpaEducationRepository.existsById(education.getId())) {
            CVEntity cvEntity = jpaCVRepository.findById(education.getIdCv()).orElseThrow(() -> new RuntimeException("CV not found"));

            EducationEntity educationEntity = EducationEntity.fromDomainModel(education, cvEntity);
            EducationEntity updateEducationEntity = jpaEducationRepository.save(educationEntity);
            return Optional.of(updateEducationEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaEducationRepository.existsById(id)){
            jpaEducationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
