package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.EmployeeHistory;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.EmployeeHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEmployeeHistoryRepository extends JpaRepository<EmployeeHistoryEntity, Long> {
}
