package com.lastsys.hexagonal.occ_clone.application.usecases.skill;

import com.lastsys.hexagonal.occ_clone.domain.models.Skill;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.skill.CreateSkillUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.skill.SkillRepositoryPort;

public class CreateSkillUseCaseImp implements CreateSkillUseCase {
    private final SkillRepositoryPort skillRepositoryPort;

    public CreateSkillUseCaseImp(SkillRepositoryPort skillRepositoryPort){
        this.skillRepositoryPort = skillRepositoryPort;
    }
    @Override
    public Skill createSkill(Skill skill) {
        return skillRepositoryPort.save(skill);
    }
}
