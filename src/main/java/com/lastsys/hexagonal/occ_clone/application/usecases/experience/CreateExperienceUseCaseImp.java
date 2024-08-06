package com.lastsys.hexagonal.occ_clone.application.usecases.experience;

import com.lastsys.hexagonal.occ_clone.domain.models.Experience;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.experience.CreateExperienceUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.experience.ExperienceRepositoryPort;

public class CreateExperienceUseCaseImp implements CreateExperienceUseCase {
    private final ExperienceRepositoryPort experienceRepositoryPort;

    public CreateExperienceUseCaseImp(ExperienceRepositoryPort experienceRepositoryPort){
        this.experienceRepositoryPort = experienceRepositoryPort;
    }
    @Override
    public Experience createExperience(Experience experience) {
        return experienceRepositoryPort.save(experience);
    }
}
