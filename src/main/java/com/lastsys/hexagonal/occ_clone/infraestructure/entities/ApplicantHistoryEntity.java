package com.lastsys.hexagonal.occ_clone.infraestructure.entities;

import com.lastsys.hexagonal.occ_clone.domain.models.ApplicantHistory;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "applicant_history")
public class ApplicantHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_applicant", nullable = false)
    private UserEntity applicant;

    @ManyToOne
    @JoinColumn(name = "id_publication", nullable = false)
    private PublicationEntity publication;

    private String action;
    private LocalDateTime creationDate;

    public ApplicantHistoryEntity() {}

    public ApplicantHistoryEntity(Long id, UserEntity applicant, PublicationEntity publication, String action, LocalDateTime creationDate) {
        this.id = id;
        this.applicant = applicant;
        this.publication = publication;
        this.action = action;
        this.creationDate = creationDate;
    }

    public static ApplicantHistoryEntity fromDomainModel(ApplicantHistory applicantHistory, UserEntity userEntity, PublicationEntity publicationEntity) {
        return new ApplicantHistoryEntity(
                applicantHistory.getId(),
                userEntity,
                publicationEntity,
                applicantHistory.getAction(),
                applicantHistory.getCreationDate()
        );
    }

    public ApplicantHistory toDomainModel() {
        return new ApplicantHistory(
                this.id,
                this.applicant.getId(),
                this.publication.getId(),
                this.action,
                this.creationDate
        );
    }

    // Getters y setters
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
