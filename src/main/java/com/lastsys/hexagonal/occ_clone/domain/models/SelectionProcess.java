package com.lastsys.hexagonal.occ_clone.domain.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class SelectionProcess {
    private Long id;
    private Long idPublication;
    private Long idApplicant;
    private String status;

    @JsonFormat(shape =JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime applicationDate;

    public SelectionProcess(
            Long id,
            Long idPublication,
            Long idApplicant,
            String status,
            LocalDateTime applicationDate
    ){
        this.id = id;
        this.idPublication = idPublication;
        this.idApplicant = idApplicant;
        this.status = status;
        this.applicationDate = applicationDate;
    }

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public Long getIdPublication(){return idPublication;}
    public void setIdPublication(Long idPublication){this.idPublication = idPublication;}
    public Long getIdApplicant(){return idApplicant;}
    public void setIdApplicant(Long idApplicant){this.idApplicant = idApplicant;}
    public String getStatus(){return status;}
    public void setStatus(String status){this.status = status;}
    public LocalDateTime getApplicationDate(){return applicationDate;}
    public void setApplicationDate(LocalDateTime applicationDate){this.applicationDate = applicationDate;}
}
