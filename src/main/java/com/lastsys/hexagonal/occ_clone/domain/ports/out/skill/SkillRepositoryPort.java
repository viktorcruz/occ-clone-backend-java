package com.lastsys.hexagonal.occ_clone.domain.ports.out.skill;

import com.lastsys.hexagonal.occ_clone.domain.models.Skill;

import java.util.List;
import java.util.Optional;

public interface SkillRepositoryPort {
    Skill save(Skill skill);
    Optional<Skill> findById(Long id);
    List<Skill> findAll();
    Optional<Skill> update(Skill skill);
    boolean deleteById(Long id);
}
