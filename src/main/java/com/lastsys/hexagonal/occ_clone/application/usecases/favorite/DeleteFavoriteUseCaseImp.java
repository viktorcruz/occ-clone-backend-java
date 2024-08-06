package com.lastsys.hexagonal.occ_clone.application.usecases.favorite;

import com.lastsys.hexagonal.occ_clone.application.usecases.publication.DeletePublicationUseCaseImp;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.favorite.DeleteFavoriteUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.favorite.FavoriteRepositoryPort;

public class DeleteFavoriteUseCaseImp implements DeleteFavoriteUseCase {
    private final FavoriteRepositoryPort favoriteRepositoryPort;

    public DeleteFavoriteUseCaseImp(FavoriteRepositoryPort favoriteRepositoryPort){
        this.favoriteRepositoryPort = favoriteRepositoryPort;
    }

    @Override
    public boolean deleteFavorite(Long id) {
        return favoriteRepositoryPort.delteById(id);
    }
}
