package com.lastsys.hexagonal.occ_clone.application.usecases.skill;

import com.lastsys.hexagonal.occ_clone.domain.ports.in.skill.DeleteSkillUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.skill.SkillRepositoryPort;

public class DeleteSkillUseCaseImp implements DeleteSkillUseCase {
    private final SkillRepositoryPort skillRepositoryPort;

    public DeleteSkillUseCaseImp(SkillRepositoryPort skillRepositoryPort){
        this.skillRepositoryPort = skillRepositoryPort;
    }
    @Override
    public boolean deleteSkill(Long id) {
        return skillRepositoryPort.deleteById(id);
    }
}
