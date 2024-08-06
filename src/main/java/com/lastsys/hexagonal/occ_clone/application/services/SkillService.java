package com.lastsys.hexagonal.occ_clone.application.services;

import com.lastsys.hexagonal.occ_clone.domain.models.Skill;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.skill.CreateSkillUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.skill.DeleteSkillUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.skill.RetrieveSkillUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.skill.UpdateSkillUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService implements CreateSkillUseCase, DeleteSkillUseCase, RetrieveSkillUseCase, UpdateSkillUseCase {
    private final CreateSkillUseCase createSkillUseCase;
    private final DeleteSkillUseCase deleteSkillUseCase;
    private final RetrieveSkillUseCase retrieveSkillUseCase;
    private final UpdateSkillUseCase updateSkillUseCase;

    public SkillService(
            CreateSkillUseCase createSkillUseCase,
            DeleteSkillUseCase deleteSkillUseCase,
            RetrieveSkillUseCase retrieveSkillUseCase,
            UpdateSkillUseCase updateSkillUseCase
    ){
        this.createSkillUseCase = createSkillUseCase;
        this.deleteSkillUseCase = deleteSkillUseCase;
        this.retrieveSkillUseCase = retrieveSkillUseCase;
        this.updateSkillUseCase = updateSkillUseCase;
    }

    @Override
    public Skill createSkill(Skill skill) {
        return createSkillUseCase.createSkill(skill);
    }

    @Override
    public boolean deleteSkill(Long id) {
        return deleteSkillUseCase.deleteSkill(id);
    }

    @Override
    public Optional<Skill> getSkill(Long id) {
        return retrieveSkillUseCase.getSkill(id);
    }

    @Override
    public List<Skill> getAllSkill() {
        return retrieveSkillUseCase.getAllSkill();
    }

    @Override
    public Optional<Skill> updateSkill(Long id, Skill skill) {
        return updateSkillUseCase.updateSkill(id, skill);
    }
}
