package com.lastsys.hexagonal.occ_clone.infraestructure.entities;

import com.lastsys.hexagonal.occ_clone.domain.models.SelectionProcess;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "selection_process")
public class SelectionProcessEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idApplicant", nullable = false)
    private UserEntity applicant;


    @ManyToOne
    @JoinColumn(name = "idPublication", nullable = false)
    private PublicationEntity publication;

    private String status;
    private LocalDateTime applicationDate;

    public SelectionProcessEntity(
            Long id,
            UserEntity applicant,
            PublicationEntity publication,
            String status,
            LocalDateTime applicationDate){
        this.id = id;
        this.publication = publication;
        this.applicant = applicant;
        this.status = status;
        this.applicationDate = applicationDate;
    }

    public static SelectionProcessEntity fromDomainModel(
            SelectionProcess selectionProcess,
            UserEntity userEntity,
            PublicationEntity publicationEntity
    ){
        return new SelectionProcessEntity(
        selectionProcess.getId(),
        userEntity,
        publicationEntity,
        selectionProcess.getStatus(),
        selectionProcess.getApplicationDate()
        );
    }

    public SelectionProcess toDomainModel(){
        return new SelectionProcess(
                this.id,
                this.publication.getId(),
                this.applicant.getId(),
                this.status,
                this.applicationDate
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PublicationEntity getPublication() {
        return publication;
    }

    public void setPublication(PublicationEntity publication) {
        this.publication = publication;
    }

    public UserEntity getApplicant() {
        return applicant;
    }

    public void setApplicant(UserEntity applicant) {
        this.applicant = applicant;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDateTime applicationDate) {
        this.applicationDate = applicationDate;
    }
}
