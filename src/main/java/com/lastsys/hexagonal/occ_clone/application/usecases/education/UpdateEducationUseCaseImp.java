package com.lastsys.hexagonal.occ_clone.application.usecases.education;

import com.lastsys.hexagonal.occ_clone.domain.models.Education;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.education.UpdateEducationUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.education.EducationRepositoryPort;

import java.util.Optional;

public class UpdateEducationUseCaseImp implements UpdateEducationUseCase {
    private final EducationRepositoryPort educationRepositoryPort;

    public UpdateEducationUseCaseImp(EducationRepositoryPort educationRepositoryPort){
        this.educationRepositoryPort = educationRepositoryPort;
    }
    @Override
    public Optional<Education> updateEducation(Long id, Education education) {
        return educationRepositoryPort.update(education);
    }
}
