package com.lastsys.hexagonal.occ_clone.application.usecases.education;

import com.lastsys.hexagonal.occ_clone.domain.models.Education;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.education.RetrieveEducationUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.education.EducationRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveEducationUseCaseImp implements RetrieveEducationUseCase {
    private final EducationRepositoryPort educationRepositoryPort;

    public RetrieveEducationUseCaseImp(EducationRepositoryPort educationRepositoryPort){
        this.educationRepositoryPort = educationRepositoryPort;
    }

    @Override
    public Optional<Education> getEducation(Long id) {
        return educationRepositoryPort.findById(id);
    }

    @Override
    public List<Education> getAllEducation() {
        return educationRepositoryPort.findAll();
    }
}
