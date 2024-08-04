package com.lastsys.hexagonal.occ_clone.infraestructure.entities;

import com.lastsys.hexagonal.occ_clone.domain.models.Publication;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "publication")
public class PublicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idRecruiter", nullable = false)
    private UserEntity recruiter;

    private String title;
    private String description;


    private LocalDateTime publicationDate;

    @ManyToOne
    @JoinColumn(name = "idRole", nullable = false)
    private RoleEntity role;
    private boolean status;
    private LocalDateTime expirationDate;

    public PublicationEntity(){}
    public PublicationEntity(Long id, UserEntity recruiter, String title, String description, LocalDateTime publicationDate, RoleEntity role, boolean status, LocalDateTime expirationDate){
        this.id = id;
        this.recruiter = recruiter;
        this.title = title;
        this.description = description;
        this.publicationDate = publicationDate;
        this.role = role;
        this.status = status;
        this.expirationDate = expirationDate;
    }

    public static PublicationEntity fromDomainModel(Publication publication, UserEntity userEntity, RoleEntity roleEntity){
        return new PublicationEntity(
                publication.getId(),
                userEntity,
                publication.getTitle(),
                publication.getDescription(),
                publication.getPublicationDate(),
                roleEntity,
                publication.getStatus(),
                publication.getExpirationDate()
        );
    }

    public Publication toDomainModel(){
        return new Publication(
                this.id,
                this.recruiter.getId(),
                this.title,
                this.description,
                this.publicationDate,
                this.role.getId(),
                this.status,
                this.expirationDate);
    }

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public UserEntity getRecruiter(){return recruiter;}
    public void setRecruiter(UserEntity recruiter){this.recruiter = recruiter;}
    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}
    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}
    public LocalDateTime getPublicationDate(){return publicationDate;}
    public void setPublicationDate(LocalDateTime publicationDate){this.publicationDate = publicationDate;}
    public RoleEntity getRole(){return role;}
    public void setRole(RoleEntity role){this.role = role;}
    public boolean getStatus(){return status;}
    public void setStatus(boolean status){this.status = status;}
    public LocalDateTime getExpirationDate(){return expirationDate;}
    public void setExpirationDate(LocalDateTime expirationDate){this.expirationDate = expirationDate;}
}
