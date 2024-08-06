package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.Experience;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.ExperienceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaExperienceRepository extends JpaRepository<ExperienceEntity, Long> {
}
