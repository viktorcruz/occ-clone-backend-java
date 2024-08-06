package com.lastsys.hexagonal.occ_clone.domain.ports.in.skill;

import com.lastsys.hexagonal.occ_clone.domain.models.Skill;

import java.util.Optional;

public interface UpdateSkillUseCase {
    Optional<Skill> updateSkill(Long id, Skill skill);
}
