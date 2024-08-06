package com.lastsys.hexagonal.occ_clone.domain.models;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

public class Experience {
    private Long id;
    private Long idCv;
    private String company;
    private String jobPosition;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Experience(Long id, Long idCv, String company, String jobPosition, String description, LocalDateTime startDate, LocalDateTime endDate){
        this.id = id;
        this.idCv = idCv;
        this.company = company;
        this.jobPosition = jobPosition;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public Long getIdCv(){return idCv;}
    public void setIdCv(Long idCv){this.idCv = idCv;}
    public String getCompany(){return company;}
    public void setCompany(String company){this.company = company;}
    public String getJobPosition(){return jobPosition;}
    public void setJobPosition(String jobPosition){this.jobPosition = jobPosition;}
    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}
    public LocalDateTime getStartDate(){return startDate;}
    public void setStartDate(LocalDateTime startDate){this.startDate = startDate;}
    public LocalDateTime getEndDate(){return endDate;}
    public void setEndDate(LocalDateTime endDate){this.endDate = endDate;}
}
