package com.lastsys.hexagonal.occ_clone.application.usecases.skill;

import com.lastsys.hexagonal.occ_clone.domain.models.Skill;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.skill.UpdateSkillUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.skill.SkillRepositoryPort;

import java.util.Optional;

public class UpdateSkillUseCaseImp implements UpdateSkillUseCase {
    private final SkillRepositoryPort skillRepositoryPort;

    public UpdateSkillUseCaseImp(SkillRepositoryPort skillRepositoryPort){
        this.skillRepositoryPort = skillRepositoryPort;
    }

    @Override
    public Optional<Skill> updateSkill(Long id, Skill skill) {
        return skillRepositoryPort.update(skill);
    }
}
