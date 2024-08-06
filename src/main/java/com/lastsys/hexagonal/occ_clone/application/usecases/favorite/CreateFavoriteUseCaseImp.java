package com.lastsys.hexagonal.occ_clone.application.usecases.favorite;

import com.lastsys.hexagonal.occ_clone.domain.models.Favorite;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.favorite.CreateFavoriteUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.favorite.FavoriteRepositoryPort;

public class CreateFavoriteUseCaseImp implements CreateFavoriteUseCase {
    private final FavoriteRepositoryPort favoriteRepositoryPort;

    public CreateFavoriteUseCaseImp(FavoriteRepositoryPort favoriteRepositoryPort){
        this.favoriteRepositoryPort = favoriteRepositoryPort;
    }

    @Override
    public Favorite createFavorite(Favorite favorite) {
        return favoriteRepositoryPort.save(favorite);
    }
}
