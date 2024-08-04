package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.infraestructure.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRoleRepository extends JpaRepository<RoleEntity, Long> {
}
