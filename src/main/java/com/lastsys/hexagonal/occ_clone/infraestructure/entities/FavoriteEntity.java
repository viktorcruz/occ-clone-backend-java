package com.lastsys.hexagonal.occ_clone.infraestructure.entities;

import com.lastsys.hexagonal.occ_clone.domain.models.Favorite;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "favorite")
public class FavoriteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name ="idApplicant", nullable = false)
    private UserEntity applicant;

    @ManyToOne
    @JoinColumn(name = "idPublication", nullable = false)
    private PublicationEntity publication;

    private LocalDateTime creationDate;

    public FavoriteEntity(){}

    public FavoriteEntity(Long id, UserEntity applicant, PublicationEntity publication, LocalDateTime creationDate){
        this.id = id;
        this.applicant = applicant;
        this.publication = publication;
        this.creationDate = creationDate;
    }

    public static FavoriteEntity fromDomainModel(Favorite favorite, UserEntity userEntity, PublicationEntity publicationEntity){
        return new FavoriteEntity(
                favorite.getId(),
                userEntity,
                publicationEntity,
                favorite.getCreationDate()
        );
    }

    public Favorite toDomainModel(){
        return new Favorite(
                this.id,
                this.applicant.getId(),
                this.publication.getId(),
                this.creationDate
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getApplicant() {
        return applicant;
    }

    public void setApplicant(UserEntity applicant) {
        this.applicant = applicant;
    }

    public PublicationEntity getPublication() {
        return publication;
    }

    public void setPublication(PublicationEntity publication) {
        this.publication = publication;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
