package com.lastsys.hexagonal.occ_clone.application.usecases.education;

import com.lastsys.hexagonal.occ_clone.domain.ports.in.education.DeleteEducationUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.education.EducationRepositoryPort;

public class DeleteEducationUseCaseImp implements DeleteEducationUseCase {
    private final EducationRepositoryPort educationRepositoryPort;

    public DeleteEducationUseCaseImp(EducationRepositoryPort educationRepositoryPort){
        this.educationRepositoryPort = educationRepositoryPort;
    }

    @Override
    public boolean deleteEducation(Long id) {
        return educationRepositoryPort.deleteById(id);
    }
}
