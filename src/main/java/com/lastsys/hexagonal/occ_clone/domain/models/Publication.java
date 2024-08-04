package com.lastsys.hexagonal.occ_clone.domain.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.RoleEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.UserEntity;

import java.time.LocalDateTime;

public class Publication {
    private Long id;
    private Long idRecruiter;
    private String title;
    private String description;
    @JsonFormat(shape =JsonFormat.Shape.STRING, pattern =  "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime publicationDate;
    private Long idRole;
    private boolean status;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime expirationDate;

    public Publication(
            Long id,
            Long idRecruiter,
            String title,
            String description,
            LocalDateTime publicationDate,
            Long idRole,
            boolean status,
            LocalDateTime expirationDate
    ){
        this.id = id;
        this.idRecruiter = idRecruiter;
        this.title = title;
        this.description = description;
        this.publicationDate = publicationDate;
        this.idRole = idRole;
        this.status = status;
        this.expirationDate = expirationDate;
    }

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public Long getIdRecruiter(){return idRecruiter;}
    public void setIdRecruiter(Long idRecruiter){this.idRecruiter = idRecruiter;}
    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}
    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}
    public LocalDateTime getPublicationDate(){return publicationDate;}
    public void setPublicationDate(LocalDateTime publicationDate){this.publicationDate = publicationDate;}
    public Long getIdRole(){return idRole;}
    public void setIdRole(Long idRole){this.idRole = idRole;}
    public boolean getStatus(){return status;}
    public void setStatus(boolean status){this.status = status;}
    public LocalDateTime getExpirationDate(){return expirationDate;}
    public void setExpirationDate(LocalDateTime expirationDate){this.expirationDate = expirationDate;}
}
