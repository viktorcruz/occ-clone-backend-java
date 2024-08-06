package com.lastsys.hexagonal.occ_clone.domain.ports.in.skill;

import com.lastsys.hexagonal.occ_clone.domain.models.Skill;

public interface CreateSkillUseCase {
    Skill createSkill(Skill skill);
}
