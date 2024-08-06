package com.lastsys.hexagonal.occ_clone.infraestructure.entities;

import com.lastsys.hexagonal.occ_clone.domain.models.Record;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="record")
public class RecordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idApplicant", nullable = false)
    private UserEntity applicant;


    private String action;
    private LocalDateTime creationDate;

    public RecordEntity(){}

    public RecordEntity(Long id, UserEntity applicant, String action, LocalDateTime creationDate){
        this.id = id;
        this.applicant = applicant;
        this.action = action;
        this.creationDate  = creationDate;
    }

    public static RecordEntity fromDomainModel(Record record, UserEntity userEntity){
        return new RecordEntity(
                record.getId(),
                userEntity,
                record.getAction(),
                record.getCreationDate()
        );
    }

    public Record toDomainModel(){
        return new Record(
                this.id,
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
