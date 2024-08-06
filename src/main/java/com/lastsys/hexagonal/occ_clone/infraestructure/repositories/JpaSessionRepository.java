package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.Session;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.SessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaSessionRepository extends JpaRepository<SessionEntity, Long> {
}
