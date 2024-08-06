package com.lastsys.hexagonal.occ_clone.application.usecases.experience;

import com.lastsys.hexagonal.occ_clone.domain.models.Experience;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.experience.RetrieveExperienceUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.experience.ExperienceRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveExperienceUseCaseImp implements RetrieveExperienceUseCase {
    private final ExperienceRepositoryPort experienceRepositoryPort;

    public RetrieveExperienceUseCaseImp(ExperienceRepositoryPort experienceRepositoryPort){
        this.experienceRepositoryPort = experienceRepositoryPort;
    }

    @Override
    public Optional<Experience> getExperience(Long id) {
        return experienceRepositoryPort.findById(id);
    }

    @Override
    public List<Experience> getAllExperience() {
        return experienceRepositoryPort.findAll();
    }
}
