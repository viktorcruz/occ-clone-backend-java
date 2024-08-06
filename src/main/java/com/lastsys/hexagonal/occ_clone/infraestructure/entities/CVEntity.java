package com.lastsys.hexagonal.occ_clone.infraestructure.entities;

import com.lastsys.hexagonal.occ_clone.domain.models.CV;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "cv")
public class CVEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name ="idApplicant", nullable = false)
    private UserEntity applicant;
    private String name;
    private String email;
    private String phone;
    private String summary;
    private LocalDateTime creationDate;

    public CVEntity(){}
    public CVEntity(Long id, UserEntity applicant, String name, String email, String phone, String summary, LocalDateTime creationDate){
        this.id = id;
        this.applicant = applicant;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.summary = summary;
        this.creationDate = creationDate;
    }

    public static CVEntity fromDomainModel(CV cv, UserEntity userEntity){
        return new CVEntity(
        cv.getId(),
        userEntity,
        cv.getName(),
        cv.getEmail(),
        cv.getPhone(),
        cv.getSummary(),
        cv.getCreationDate());
    }

    public CV toDomainModel(){
        return new CV(
                this.id,
                this.applicant.getId(),
                this.name,
                this.email,
                this.phone,
                this.summary,
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
