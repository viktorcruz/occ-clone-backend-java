package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.Favorite;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.FavoriteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaFavoriteRepository extends JpaRepository<FavoriteEntity, Long> {
}
