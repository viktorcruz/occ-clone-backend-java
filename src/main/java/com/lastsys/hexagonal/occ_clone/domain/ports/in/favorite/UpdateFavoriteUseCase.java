package com.lastsys.hexagonal.occ_clone.domain.ports.in.favorite;

import com.lastsys.hexagonal.occ_clone.domain.models.Favorite;

import java.util.Optional;

public interface UpdateFavoriteUseCase {
    Optional<Favorite> updateFavorite(Long id, Favorite favorite);
}
