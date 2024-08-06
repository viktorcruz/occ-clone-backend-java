package com.lastsys.hexagonal.occ_clone.domain.ports.in.skill;

import com.lastsys.hexagonal.occ_clone.domain.models.Skill;

import java.util.List;
import java.util.Optional;

public interface RetrieveSkillUseCase {
    Optional<Skill> getSkill(Long id);
    List<Skill> getAllSkill();
}
