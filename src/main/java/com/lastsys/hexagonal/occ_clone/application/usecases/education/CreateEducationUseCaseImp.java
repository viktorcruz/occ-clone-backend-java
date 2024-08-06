package com.lastsys.hexagonal.occ_clone.application.usecases.education;

import com.lastsys.hexagonal.occ_clone.application.usecases.skill.CreateSkillUseCaseImp;
import com.lastsys.hexagonal.occ_clone.domain.models.Education;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.education.CreateEducationUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.education.EducationRepositoryPort;

public class CreateEducationUseCaseImp implements CreateEducationUseCase {
    private final EducationRepositoryPort educationRepositoryPort;

    public CreateEducationUseCaseImp(EducationRepositoryPort educationRepositoryPort){
        this.educationRepositoryPort = educationRepositoryPort;
    }

    @Override
    public Education createEducation(Education education) {
        return educationRepositoryPort.save(education);
    }
}
