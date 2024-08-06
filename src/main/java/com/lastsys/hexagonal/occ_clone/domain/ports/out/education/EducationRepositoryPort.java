package com.lastsys.hexagonal.occ_clone.domain.ports.out.education;

import com.lastsys.hexagonal.occ_clone.domain.models.Education;

import java.util.List;
import java.util.Optional;

public interface EducationRepositoryPort {
    Education save(Education education);
    Optional<Education> findById(Long id);
    List<Education> findAll();
    Optional<Education> update(Education education);
    boolean deleteById(Long id);
}