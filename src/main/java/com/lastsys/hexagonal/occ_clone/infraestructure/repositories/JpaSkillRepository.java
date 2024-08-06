package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.Skill;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.SkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaSkillRepository extends JpaRepository<SkillEntity, Long> {
}
