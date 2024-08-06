package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.Record;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.RecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRecordRepository extends JpaRepository<RecordEntity, Long> {
}
