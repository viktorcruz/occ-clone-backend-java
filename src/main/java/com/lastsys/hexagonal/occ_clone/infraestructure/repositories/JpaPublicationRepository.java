package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.infraestructure.entities.PublicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPublicationRepository extends JpaRepository<PublicationEntity, Long> {
}