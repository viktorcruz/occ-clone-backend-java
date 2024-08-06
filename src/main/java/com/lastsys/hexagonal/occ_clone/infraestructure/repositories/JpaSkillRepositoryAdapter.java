package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.Skill;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.skill.SkillRepositoryPort;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.CVEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.SkillEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaSkillRepositoryAdapter implements SkillRepositoryPort {
    private final JpaSkillRepository jpaSkillRepository;
    private final JpaCVRepository jpaCVRepository;

    public JpaSkillRepositoryAdapter(
            JpaSkillRepository jpaSkillRepository,
            JpaCVRepository jpaCVRepository
    ){
        this.jpaCVRepository = jpaCVRepository;
        this.jpaSkillRepository = jpaSkillRepository;
    }


    @Override
    public Skill save(Skill skill) {
        CVEntity cvEntity = jpaCVRepository.findById(skill.getIdCv())
                .orElseThrow(()-> new RuntimeException("CV not found"));
        SkillEntity skillEntity = SkillEntity.fromDomainModel(skill, cvEntity);
        SkillEntity saveSkillEntity = jpaSkillRepository.save(skillEntity);
        return saveSkillEntity.toDomainModel();
    }

    @Override
    public Optional<Skill> findById(Long id) {
        return jpaSkillRepository.findById(id)
                .map(SkillEntity::toDomainModel);
    }

    @Override
    public List<Skill> findAll() {
        return jpaSkillRepository.findAll()
                .stream().map(SkillEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Skill> update(Skill skill) {
        if(jpaSkillRepository.existsById(skill.getId())){
            CVEntity cvEntity = jpaCVRepository.findById(skill.getIdCv())
                    .orElseThrow(()-> new RuntimeException("CV not found"));
            SkillEntity skillEntity = SkillEntity.fromDomainModel(skill, cvEntity);
            SkillEntity updateSkillEntity = jpaSkillRepository.save(skillEntity);
            return Optional.of(updateSkillEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaSkillRepository.existsById(id)){
            jpaSkillRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
