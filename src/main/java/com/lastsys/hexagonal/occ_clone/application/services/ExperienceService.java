package com.lastsys.hexagonal.occ_clone.application.services;

import com.lastsys.hexagonal.occ_clone.domain.models.Experience;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.experience.CreateExperienceUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.experience.DeleteExperienceUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.experience.RetrieveExperienceUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.experience.UpdateExperienceUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceService implements CreateExperienceUseCase, DeleteExperienceUseCase, RetrieveExperienceUseCase, UpdateExperienceUseCase {
    private final CreateExperienceUseCase createExperienceUseCase;
    private final DeleteExperienceUseCase deleteExperienceUseCase;
    private final RetrieveExperienceUseCase retrieveExperienceUseCase;
    private final UpdateExperienceUseCase updateExperienceUseCase;

    public ExperienceService(
            CreateExperienceUseCase createExperienceUseCase,
            DeleteExperienceUseCase deleteExperienceUseCase,
            RetrieveExperienceUseCase retrieveExperienceUseCase,
            UpdateExperienceUseCase updateExperienceUseCase
    ){
        this.createExperienceUseCase = createExperienceUseCase;
        this.deleteExperienceUseCase = deleteExperienceUseCase;
        this.retrieveExperienceUseCase = retrieveExperienceUseCase;
        this.updateExperienceUseCase = updateExperienceUseCase;
    }

    @Override
    public Experience createExperience(Experience experience) {
        return createExperienceUseCase.createExperience(experience);
    }

    @Override
    public boolean deleteExperience(Long id) {
        return deleteExperienceUseCase.deleteExperience(id);
    }

    @Override
    public Optional<Experience> getExperience(Long id) {
        return retrieveExperienceUseCase.getExperience(id);
    }

    @Override
    public List<Experience> getAllExperience() {
        return retrieveExperienceUseCase.getAllExperience();
    }

    @Override
    public Optional<Experience> updateExperience(Long id, Experience experience) {
        return updateExperienceUseCase.updateExperience(id, experience);
    }
}
