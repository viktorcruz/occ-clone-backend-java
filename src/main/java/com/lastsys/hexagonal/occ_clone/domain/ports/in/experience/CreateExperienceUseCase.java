package com.lastsys.hexagonal.occ_clone.domain.ports.in.experience;

import com.lastsys.hexagonal.occ_clone.domain.models.Experience;

public interface CreateExperienceUseCase {
    Experience createExperience(Experience experience);
}
