package com.lastsys.hexagonal.occ_clone.infraestructure.entities;

import com.lastsys.hexagonal.occ_clone.domain.models.Education;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "education")
public class EducationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idCv", nullable = false)
    private CVEntity cv;

    private String academicInstitution;
    private String typeAcademicDegree;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public EducationEntity(Long id, CVEntity cv, String academicInstitution, String typeAcademicDegree, LocalDateTime startDate, LocalDateTime endDate){
        this.id = id;
        this.cv = cv;
        this.academicInstitution = academicInstitution;
        this.typeAcademicDegree= typeAcademicDegree;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public static EducationEntity fromDomainModel(Education education, CVEntity cvEntity){
        return new EducationEntity(
                education.getId(),
                cvEntity,
                education.getAcademicInstitution(),
                education.getTypeAcademicDegree(),
                education.getStartDate(),
                education.getEndDate()
        );
    }

    public Education toDomainModel(){
        return new Education(
                this.id,
                this.cv.getId(),
                this.academicInstitution,
                this.typeAcademicDegree,
                this. startDate,
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

    public String getAcademicInstitution() {
        return academicInstitution;
    }

    public void setAcademicInstitution(String academicInstitution) {
        this.academicInstitution = academicInstitution;
    }

    public String getTypeAcademicDegree() {
        return typeAcademicDegree;
    }

    public void setTypeAcademicDegree(String typeAcademicDegree) {
        this.typeAcademicDegree = typeAcademicDegree;
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
