package com.lastsys.hexagonal.occ_clone.domain.models;

import java.time.LocalDateTime;

public class Record {
    private Long id;
    private Long idUser;
    private String action;
    private LocalDateTime creationDate;

    public Record(Long id, Long idUser, String action, LocalDateTime creationDate){
        this.id = id;
        this.idUser = idUser;
        this.action = action;
        this.creationDate = creationDate;
    }

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public Long getIdUser(){return idUser;}
    public void setIdUser(Long idUser){this.idUser = idUser;}
    public String getAction(){return action;}
    public void setAction(String action){this.action = action;}
    public LocalDateTime getCreationDate(){return creationDate;}
    public void setCreationDate(LocalDateTime creationDate){this.creationDate = creationDate;}
}
