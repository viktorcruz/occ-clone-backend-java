package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.Favorite;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.favorite.FavoriteRepositoryPort;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.FavoriteEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.PublicationEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaFavoriteRepositoryAdapter implements FavoriteRepositoryPort {
    private final JpaFavoriteRepository jpaFavoriteRepository;
    private final JpaUserRepository jpaUserRepository;
    private final JpaPublicationRepository jpaPublicationRepository;

    public JpaFavoriteRepositoryAdapter(
            JpaFavoriteRepository jpaFavoriteRepository,
            JpaUserRepository jpaUserRepository,
            JpaPublicationRepository jpaPublicationRepository
    ){
        this.jpaFavoriteRepository = jpaFavoriteRepository;
        this.jpaUserRepository = jpaUserRepository;
        this.jpaPublicationRepository = jpaPublicationRepository;
    }

    @Override
    public Favorite save(Favorite favorite) {
        UserEntity userEntity = jpaUserRepository.findById(favorite.getIdApplicant())
                .orElseThrow(()->new RuntimeException("Applicant not found"));
        PublicationEntity publicationEntity = jpaPublicationRepository.findById(favorite.getIdPublication())
                .orElseThrow(()-> new RuntimeException("Publication not found"));

        FavoriteEntity favoriteEntity = FavoriteEntity.fromDomainModel(favorite, userEntity, publicationEntity);
        FavoriteEntity saveFavoriteEntity = jpaFavoriteRepository.save(favoriteEntity);
        return saveFavoriteEntity.toDomainModel();
    }

    @Override
    public Optional<Favorite> findById(Long id) {
        return jpaFavoriteRepository.findById(id)
                .map(FavoriteEntity::toDomainModel);
    }

    @Override
    public List<Favorite> findAll() {
        return jpaFavoriteRepository.findAll()
                .stream().map(FavoriteEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Favorite> update(Favorite favorite) {
        if(jpaFavoriteRepository.existsById(favorite.getId())){
            UserEntity userEntity = jpaUserRepository.findById(favorite.getIdApplicant())
                    .orElseThrow((()-> new RuntimeException("Applicant not found")));
            PublicationEntity publicationEntity = jpaPublicationRepository.findById(favorite.getIdPublication())
                    .orElseThrow(()-> new RuntimeException("Publication not found"));

            FavoriteEntity favoriteEntity = FavoriteEntity.fromDomainModel(favorite, userEntity, publicationEntity);
            FavoriteEntity updateFavoriteEntity = jpaFavoriteRepository.save(favoriteEntity);
            return Optional.of(updateFavoriteEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean delteById(Long id) {
        if(jpaFavoriteRepository.existsById(id)){
            jpaFavoriteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
