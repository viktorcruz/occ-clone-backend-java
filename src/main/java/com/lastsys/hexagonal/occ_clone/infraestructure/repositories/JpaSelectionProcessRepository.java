package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.SelectionProcess;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.SelectionProcessEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaSelectionProcessRepository extends JpaRepository<SelectionProcessEntity, Long> {
}
