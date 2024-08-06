package com.lastsys.hexagonal.occ_clone.application.usecases.skill;

import com.lastsys.hexagonal.occ_clone.domain.models.Skill;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.skill.RetrieveSkillUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.skill.SkillRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveSkillUseCaseImp implements RetrieveSkillUseCase {
    private final SkillRepositoryPort skillRepositoryPort;

    public RetrieveSkillUseCaseImp(SkillRepositoryPort skillRepositoryPort){
        this.skillRepositoryPort = skillRepositoryPort;
    }

    @Override
    public Optional<Skill> getSkill(Long id) {
        return skillRepositoryPort.findById(id);
    }

    @Override
    public List<Skill> getAllSkill() {
        return skillRepositoryPort.findAll();
    }
}
