package com.lastsys.hexagonal.occ_clone.application.services;

import com.lastsys.hexagonal.occ_clone.domain.models.Education;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.education.CreateEducationUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.education.DeleteEducationUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.education.RetrieveEducationUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.education.UpdateEducationUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EducationService implements CreateEducationUseCase, DeleteEducationUseCase, RetrieveEducationUseCase, UpdateEducationUseCase {
    private final CreateEducationUseCase createEducationUseCase;
    private final DeleteEducationUseCase deleteEducationUseCase;
    private final RetrieveEducationUseCase retrieveEducationUseCase;
    private final UpdateEducationUseCase updateEducationUseCase;

    public EducationService(
            CreateEducationUseCase createEducationUseCase,
            DeleteEducationUseCase deleteEducationUseCase,
            RetrieveEducationUseCase retrieveEducationUseCase,
            UpdateEducationUseCase updateEducationUseCase
    ){
        this.createEducationUseCase = createEducationUseCase;
        this.deleteEducationUseCase = deleteEducationUseCase;
        this.retrieveEducationUseCase = retrieveEducationUseCase;
        this.updateEducationUseCase = updateEducationUseCase;
    }

    @Override
    public Education createEducation(Education education) {
        return createEducationUseCase.createEducation(education);
    }

    @Override
    public boolean deleteEducation(Long id) {
        return deleteEducationUseCase.deleteEducation(id);
    }

    @Override
    public Optional<Education> getEducation(Long id) {
        return retrieveEducationUseCase.getEducation(id);
    }

    @Override
    public List<Education> getAllEducation() {
        return retrieveEducationUseCase.getAllEducation();
    }

    @Override
    public Optional<Education> updateEducation(Long id, Education education) {
        return updateEducationUseCase.updateEducation(id, education);
    }
}
