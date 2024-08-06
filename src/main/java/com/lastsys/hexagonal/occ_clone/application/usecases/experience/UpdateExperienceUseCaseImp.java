package com.lastsys.hexagonal.occ_clone.application.usecases.experience;

import com.lastsys.hexagonal.occ_clone.domain.models.Experience;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.experience.UpdateExperienceUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.experience.ExperienceRepositoryPort;

import java.util.Optional;

public class UpdateExperienceUseCaseImp implements UpdateExperienceUseCase {
    private final ExperienceRepositoryPort experienceRepositoryPort;

    public UpdateExperienceUseCaseImp(ExperienceRepositoryPort experienceRepositoryPort){
        this.experienceRepositoryPort = experienceRepositoryPort;
    }
    @Override
    public Optional<Experience> updateExperience(Long id, Experience experience) {
        return experienceRepositoryPort.update(experience);
    }
}
