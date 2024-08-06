package com.lastsys.hexagonal.occ_clone.domain.models;

import java.time.LocalDateTime;

public class Favorite {
    private Long id;
    private Long idApplicant;
    private Long idPublication;
    private LocalDateTime creationDate;

    public Favorite(Long id, Long idApplicant, Long idPublication, LocalDateTime creationDate){
        this.id = id;
        this.idApplicant = idApplicant;
        this.idPublication = idPublication;
        this.creationDate = creationDate;
    }

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public Long getIdApplicant(){return idApplicant;}
    public void setIdApplicant(Long idApplicant){this.idApplicant = idApplicant;}
    public Long getIdPublication(){return idPublication;}
    public void setIdPublication(Long idPublication){this.idPublication = idPublication;}
    public LocalDateTime getCreationDate(){return creationDate;}
    public void setCreationDate(LocalDateTime creationDate){this.creationDate = creationDate;}
}
