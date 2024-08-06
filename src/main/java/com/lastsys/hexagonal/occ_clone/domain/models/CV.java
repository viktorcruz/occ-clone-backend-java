package com.lastsys.hexagonal.occ_clone.domain.models;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

public class CV {
    private Long id;
    private Long idApplicant;
    private String name;
    private String email;
    private String phone;
    private String summary;
    private LocalDateTime creationDate;

    public CV(Long id, Long idApplicant, String name, String email, String phone, String summary, LocalDateTime creationDate){
        this.id = id;
        this.idApplicant =idApplicant;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.summary = summary;
        this.creationDate = creationDate;
    }

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public Long getIdApplicant(){return idApplicant;}
    public void setIdApplicant(Long idApplicant){this.idApplicant = idApplicant;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}
    public String getPhone(){return phone;}
    public void setPhone(String phone){this.phone = phone;}
    public String getSummary(){return summary;}
    public void setSummary(String summary){this.summary = summary;}
    public LocalDateTime getCreationDate(){return creationDate;}
    public void setCreationDate(LocalDateTime creationDate){this.creationDate = creationDate;}
}
