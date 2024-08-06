package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.Education;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.EducationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEducationRepository extends JpaRepository<EducationEntity, Long> {
}
