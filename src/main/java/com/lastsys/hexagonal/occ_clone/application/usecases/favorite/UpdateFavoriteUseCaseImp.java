package com.lastsys.hexagonal.occ_clone.application.usecases.favorite;

import com.lastsys.hexagonal.occ_clone.domain.models.Favorite;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.favorite.UpdateFavoriteUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.favorite.FavoriteRepositoryPort;

import java.util.Optional;

public class UpdateFavoriteUseCaseImp implements UpdateFavoriteUseCase {
    private final FavoriteRepositoryPort favoriteRepositoryPort;

    public UpdateFavoriteUseCaseImp(FavoriteRepositoryPort favoriteRepositoryPort){
        this.favoriteRepositoryPort = favoriteRepositoryPort;
    }

    @Override
    public Optional<Favorite> updateFavorite(Long id, Favorite favorite) {
        return favoriteRepositoryPort.update(favorite);
    }
}
