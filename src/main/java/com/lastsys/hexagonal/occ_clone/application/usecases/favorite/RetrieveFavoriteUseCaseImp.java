package com.lastsys.hexagonal.occ_clone.application.usecases.favorite;

import com.lastsys.hexagonal.occ_clone.domain.models.Favorite;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.favorite.RetrieveFavoriteUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.favorite.FavoriteRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveFavoriteUseCaseImp implements RetrieveFavoriteUseCase {
    private final FavoriteRepositoryPort favoriteRepositoryPort;

    public RetrieveFavoriteUseCaseImp(FavoriteRepositoryPort favoriteRepositoryPort){
        this.favoriteRepositoryPort = favoriteRepositoryPort;
    }
    @Override
    public Optional<Favorite> getFavorite(Long id) {
        return favoriteRepositoryPort.findById(id);
    }

    @Override
    public List<Favorite> getAllFavorite() {
        return favoriteRepositoryPort.findAll();
    }
}
