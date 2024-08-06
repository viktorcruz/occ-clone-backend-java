package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.Experience;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.experience.ExperienceRepositoryPort;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.CVEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.ExperienceEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaExperienceRepositoryAdapter implements ExperienceRepositoryPort {
    private final JpaExperienceRepository jpaExperienceRepository;
    private final JpaCVRepository jpaCVRepository;

    public JpaExperienceRepositoryAdapter(
            JpaExperienceRepository jpaExperienceRepository,
            JpaCVRepository jpaCVRepository
    ){
        this.jpaCVRepository = jpaCVRepository;
        this.jpaExperienceRepository = jpaExperienceRepository;
    }

    @Override
    public Experience save(Experience experience) {
        CVEntity cvEntity = jpaCVRepository.findById(experience.getIdCv())
                .orElseThrow(()->new RuntimeException("CV not found"));

        ExperienceEntity experienceEntity = ExperienceEntity.fromDomainModel(experience, cvEntity);
        ExperienceEntity saveExperienceEntity = jpaExperienceRepository.save(experienceEntity);
        return saveExperienceEntity.toDomainModel();
    }

    @Override
    public Optional<Experience> findById(Long id) {
        return jpaExperienceRepository.findById(id)
                .map(ExperienceEntity::toDomainModel);
    }

    @Override
    public List<Experience> findAll() {
        return jpaExperienceRepository.findAll()
                .stream().map(ExperienceEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Experience> update(Experience experience) {
        if(jpaExperienceRepository.existsById(experience.getId())){
            CVEntity cvEntity = jpaCVRepository.findById(experience.getIdCv())
                    .orElseThrow(()->new RuntimeException("CV not found"));
            ExperienceEntity experienceEntity = ExperienceEntity.fromDomainModel(experience, cvEntity);
            ExperienceEntity updateExperienceEntity = jpaExperienceRepository.save(experienceEntity);
            return Optional.of(updateExperienceEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaExperienceRepository.existsById(id)){
            jpaExperienceRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
