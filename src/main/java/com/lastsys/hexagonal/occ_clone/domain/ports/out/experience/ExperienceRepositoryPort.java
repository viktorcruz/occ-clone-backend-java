package com.lastsys.hexagonal.occ_clone.domain.ports.out.experience;

import com.lastsys.hexagonal.occ_clone.domain.models.Experience;

import java.util.List;
import java.util.Optional;

public interface ExperienceRepositoryPort {
    Experience save(Experience experience);
    Optional<Experience> findById(Long id);
    List<Experience> findAll();
    Optional<Experience> update(Experience experience);
    boolean deleteById(Long id);
}
