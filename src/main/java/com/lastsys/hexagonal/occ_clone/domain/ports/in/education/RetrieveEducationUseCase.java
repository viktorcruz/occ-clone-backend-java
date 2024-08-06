package com.lastsys.hexagonal.occ_clone.domain.ports.in.education;

import com.lastsys.hexagonal.occ_clone.domain.models.Education;

import java.util.List;
import java.util.Optional;

public interface RetrieveEducationUseCase {
    Optional<Education> getEducation(Long id);
    List<Education> getAllEducation();
}
