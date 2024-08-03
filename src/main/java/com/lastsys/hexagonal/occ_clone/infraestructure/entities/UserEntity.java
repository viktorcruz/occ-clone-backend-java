package com.lastsys.hexagonal.occ_clone.infraestructure.entities;

import com.lastsys.hexagonal.occ_clone.domain.models.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Long userTypeId;
    private LocalDateTime creationDate;

    public UserEntity(){}

    public UserEntity(Long id, String name, String email, Long userTypeId, LocalDateTime creationDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.userTypeId = userTypeId;
        this.creationDate = creationDate;
    }

    public static UserEntity fromDomainModel(User user){
        return new UserEntity(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getUserTypeId(),
                user.getCreationDate()
        );
    }

    public User toDomainModel(){
        return new User(id, name, email, userTypeId, creationDate);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getUserType() {
        return userTypeId;
    }

    public void setUserType(Long userTypeId) {
        this.userTypeId = userTypeId;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
