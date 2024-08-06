package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.ApplicantHistory;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.ApplicantHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaApplicantHistoryRepository extends JpaRepository<ApplicantHistoryEntity, Long> {
}
