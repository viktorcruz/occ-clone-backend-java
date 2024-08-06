package com.lastsys.hexagonal.occ_clone.domain.ports.in.favorite;

import com.lastsys.hexagonal.occ_clone.domain.models.Favorite;

public interface CreateFavoriteUseCase {
    Favorite createFavorite(Favorite favorite);
}
