package com.lastsys.hexagonal.occ_clone.domain.ports.out.favorite;

import com.lastsys.hexagonal.occ_clone.domain.models.Favorite;

import java.util.List;
import java.util.Optional;

public interface FavoriteRepositoryPort {
    Favorite save(Favorite favorite);
    Optional<Favorite> findById(Long id);
    List<Favorite> findAll();
    Optional<Favorite> update(Favorite favorite);
    boolean delteById(Long id);
}
