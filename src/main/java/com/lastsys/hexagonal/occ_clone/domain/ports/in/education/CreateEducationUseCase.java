package com.lastsys.hexagonal.occ_clone.domain.ports.in.education;

import com.lastsys.hexagonal.occ_clone.domain.models.Education;

public interface CreateEducationUseCase {
    Education createEducation(Education education);
}
