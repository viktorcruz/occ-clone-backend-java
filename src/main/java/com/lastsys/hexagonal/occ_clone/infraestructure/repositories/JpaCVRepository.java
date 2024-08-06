package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.CV;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.CVEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCVRepository extends JpaRepository<CVEntity, Long> {
}
