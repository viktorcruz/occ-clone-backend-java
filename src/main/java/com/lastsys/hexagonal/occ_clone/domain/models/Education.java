package com.lastsys.hexagonal.occ_clone.domain.models;

import java.time.LocalDateTime;

public class Education {
    private Long id;
    private Long idCv;
    private String academicInstitution;
    private String typeAcademicDegree;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Education(Long id, Long idCv, String academicInstitution, String typeAcademicDegree, LocalDateTime startDate, LocalDateTime endDate){
        this.id = id;
        this.idCv = idCv;
        this.academicInstitution = academicInstitution;
        this.typeAcademicDegree = typeAcademicDegree;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public Long getIdCv(){return idCv;}
    public void setIdCv(Long idCv){this.idCv = idCv;}
    public String getAcademicInstitution(){return academicInstitution;}
    public void setAcademicInstitution(String academicInstitution){this.academicInstitution = academicInstitution;}
    public String getTypeAcademicDegree(){return typeAcademicDegree;}
    public void setTypeAcademicDegree(String typeAcademicDegree){this.typeAcademicDegree = typeAcademicDegree;}
    public LocalDateTime getStartDate(){return startDate;}
    public void setStartDate(LocalDateTime startDate){this.startDate = startDate;}
    public LocalDateTime getEndDate(){return endDate;}
    public void setEndDate(LocalDateTime endDate){this.endDate = endDate;}
}
