package com.lastsys.hexagonal.occ_clone.infraestructure.entities;

import com.lastsys.hexagonal.occ_clone.domain.models.Experience;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "experience")
public class ExperienceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idCv", nullable = false)
    private CVEntity cv;

    private String company;
    private String jobPosition;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public ExperienceEntity(Long id, CVEntity cv, String company, String jobPosition, String description, LocalDateTime startDate, LocalDateTime endDate){
        this.id = id;
        this.cv = cv;
        this.company = company;
        this.jobPosition = jobPosition;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public static ExperienceEntity fromDomainModel(Experience experience, CVEntity cvEntity){
        return new ExperienceEntity(
        experience.getId(),
        cvEntity,
        experience.getCompany(),
        experience.getJobPosition(),
        experience.getDescription(),
        experience.getStartDate(),
        experience.getEndDate()
        );
    }

    public Experience toDomainModel(){
        return new Experience(
                this.id,
                this.cv.getId(),
                this.company,
                this.jobPosition,
                this.description,
                this.startDate,
                this.endDate
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CVEntity getCv() {
        return cv;
    }

    public void setCv(CVEntity cv) {
        this.cv = cv;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
