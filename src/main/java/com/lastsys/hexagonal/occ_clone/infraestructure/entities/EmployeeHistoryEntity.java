package com.lastsys.hexagonal.occ_clone.infraestructure.entities;

import com.lastsys.hexagonal.occ_clone.domain.models.EmployeeHistory;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name ="employee_history")
public class EmployeeHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name ="idApplicant", nullable = false)
    private UserEntity applicant;

    @ManyToOne
    @JoinColumn(name ="idPublication", nullable = false)
    private PublicationEntity publication;

    private String action;
    private LocalDateTime creationDate;

    public EmployeeHistoryEntity(
            Long id,
            UserEntity applicant,
            PublicationEntity publication,
            String action,
            LocalDateTime creationDate
    ){
        this.id = id;
        this.applicant = applicant;
        this.publication = publication;
        this.action = action;
        this.creationDate = creationDate;
    }

    public static EmployeeHistoryEntity fromDomainModel(EmployeeHistory employeeHistory, UserEntity userEntity, PublicationEntity publicationEntity){
        return new EmployeeHistoryEntity(
            employeeHistory.getId(),
            userEntity,
            publicationEntity,
            employeeHistory.getAction(),
            employeeHistory.getCreationDate()
        );
    }

    public EmployeeHistory toDomainModel(){
        return new EmployeeHistory(
                this.id,
                this.publication.getId(),
                this.applicant.getId(),
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
