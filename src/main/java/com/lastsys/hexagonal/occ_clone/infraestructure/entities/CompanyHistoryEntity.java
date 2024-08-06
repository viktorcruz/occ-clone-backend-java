package com.lastsys.hexagonal.occ_clone.infraestructure.entities;

import com.lastsys.hexagonal.occ_clone.domain.models.CompanyHistory;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "company_history")
public class CompanyHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idRecruiter", nullable = false)
    private UserEntity recruiter;

    @ManyToOne
    @JoinColumn(name = "idPublication", nullable = false)
    private PublicationEntity publication;

    private String action;
    private LocalDateTime creationDate;

    public CompanyHistoryEntity(){}
    public CompanyHistoryEntity(Long id, UserEntity userEntity, PublicationEntity publicationEntity, String action, LocalDateTime creationDate){
        this.id = id;
        this.recruiter = userEntity;
        this.publication = publicationEntity;
        this.action = action;
        this.creationDate = creationDate;
    }

    public static CompanyHistoryEntity fromDomainModel(CompanyHistory companyHistory, UserEntity userEntity, PublicationEntity publicationEntity){
        return new CompanyHistoryEntity(
                companyHistory.getId(),
                userEntity,
                publicationEntity,
                companyHistory.getAction(),
                companyHistory.getCreationDate()
        );
    }

    public CompanyHistory toDomainModel(){
        return new CompanyHistory(
                this.id,
                this.recruiter.getId(),
                this.publication.getId(),
                this.action,
                this.creationDate
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(UserEntity recruiter) {
        this.recruiter = recruiter;
    }

    public PublicationEntity getPublication() {
        return publication;
    }

    public void setPublication(PublicationEntity publication) {
        this.publication = publication;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
