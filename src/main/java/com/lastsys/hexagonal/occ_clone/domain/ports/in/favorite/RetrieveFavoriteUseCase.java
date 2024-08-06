package com.lastsys.hexagonal.occ_clone.domain.ports.in.favorite;

import com.lastsys.hexagonal.occ_clone.domain.models.Favorite;

import java.util.Optional;
import java.util.List;
public interface RetrieveFavoriteUseCase {
    Optional<Favorite> getFavorite(Long id);
    List<Favorite> getAllFavorite();
}
