package com.lastsys.hexagonal.occ_clone.application.services;

import com.lastsys.hexagonal.occ_clone.application.usecases.favorite.RetrieveFavoriteUseCaseImp;
import com.lastsys.hexagonal.occ_clone.domain.models.Favorite;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.favorite.CreateFavoriteUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.favorite.DeleteFavoriteUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.favorite.RetrieveFavoriteUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.favorite.UpdateFavoriteUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoriteService implements CreateFavoriteUseCase, DeleteFavoriteUseCase, RetrieveFavoriteUseCase, UpdateFavoriteUseCase {
    private CreateFavoriteUseCase createFavoriteUseCase;
    private DeleteFavoriteUseCase deleteFavoriteUseCase;
    private RetrieveFavoriteUseCase retrieveFavoriteUseCase;
    private UpdateFavoriteUseCase updateFavoriteUseCase;

    public FavoriteService(
            CreateFavoriteUseCase createFavoriteUseCase,
            DeleteFavoriteUseCase deleteFavoriteUseCase,
            RetrieveFavoriteUseCase retrieveFavoriteUseCase,
            UpdateFavoriteUseCase updateFavoriteUseCase
    ){
        this.createFavoriteUseCase = createFavoriteUseCase;
        this.deleteFavoriteUseCase = deleteFavoriteUseCase;
        this.retrieveFavoriteUseCase = retrieveFavoriteUseCase;
        this.updateFavoriteUseCase = updateFavoriteUseCase;
    }

    @Override
    public Favorite createFavorite(Favorite favorite) {
        return createFavoriteUseCase.createFavorite(favorite);
    }

    @Override
    public boolean deleteFavorite(Long id) {
        return deleteFavoriteUseCase.deleteFavorite(id);
    }

    @Override
    public Optional<Favorite> getFavorite(Long id) {
        return retrieveFavoriteUseCase.getFavorite(id);
    }

    @Override
    public List<Favorite> getAllFavorite() {
        return retrieveFavoriteUseCase.getAllFavorite();
    }

    @Override
    public Optional<Favorite> updateFavorite(Long id, Favorite favorite) {
        return updateFavoriteUseCase.updateFavorite(id, favorite);
    }
}
