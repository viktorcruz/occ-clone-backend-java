package com.lastsys.hexagonal.occ_clone.application.usecases.experience;

import com.lastsys.hexagonal.occ_clone.domain.ports.in.experience.DeleteExperienceUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.experience.ExperienceRepositoryPort;

public class DeleteExperienceUseCaseImp implements DeleteExperienceUseCase {
    private final ExperienceRepositoryPort experienceRepositoryPort;

    public DeleteExperienceUseCaseImp(ExperienceRepositoryPort experienceRepositoryPort){
        this.experienceRepositoryPort = experienceRepositoryPort;
    }
    @Override
    public boolean deleteExperience(Long id) {
        return experienceRepositoryPort.deleteById(id);
    }
}
