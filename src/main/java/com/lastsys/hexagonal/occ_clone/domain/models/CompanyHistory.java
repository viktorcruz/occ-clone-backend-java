package com.lastsys.hexagonal.occ_clone.domain.models;

import java.time.LocalDateTime;

public class CompanyHistory {
    private Long id;
    private Long idRecruiter;
    private Long idPublication;
    private String action;
    private LocalDateTime creationDate;

    public CompanyHistory(Long id, Long idRecruiter, Long idPublication, String action, LocalDateTime creationDate){
        this.id = id;
        this.idRecruiter = idRecruiter;
        this.idPublication = idPublication;
        this.action = action;
        this.creationDate = creationDate;
    }

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public Long getIdRecruiter(){return idRecruiter;}
    public void setIdRecruiter(Long idRecruiter){this.idRecruiter = idRecruiter;}
    public Long getIdPublication(){return idPublication;}
    public void setIdPublication(Long idPublication){this.idPublication = idPublication;}
    public String getAction(){return action;}
    public void setAction(String action){this.action = action;}
    public LocalDateTime getCreationDate(){return creationDate;}
    public void setCreationDate(LocalDateTime creationDate){this.creationDate = creationDate;}
}
