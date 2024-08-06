package com.lastsys.hexagonal.occ_clone.domain.ports.in.experience;

import com.lastsys.hexagonal.occ_clone.domain.models.Experience;

import java.util.List;
import java.util.Optional;

public interface RetrieveExperienceUseCase {
    Optional<Experience> getExperience(Long id);
    List<Experience> getAllExperience();
}
