package com.lastsys.hexagonal.occ_clone.domain.ports.in.experience;

import com.lastsys.hexagonal.occ_clone.domain.models.Experience;

import java.util.Optional;

public interface UpdateExperienceUseCase {
    Optional<Experience> updateExperience(Long id, Experience experience);
}
