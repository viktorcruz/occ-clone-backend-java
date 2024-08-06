package com.lastsys.hexagonal.occ_clone.domain.ports.in.education;

import com.lastsys.hexagonal.occ_clone.domain.models.Education;

import java.util.Optional;

public interface UpdateEducationUseCase {
    Optional<Education> updateEducation(Long id, Education education);
}
