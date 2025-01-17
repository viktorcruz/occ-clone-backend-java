package com.lastsys.hexagonal.occ_clone.domain.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String name;
    private String email;
    private Long userTypeId;
    @JsonFormat(shape =JsonFormat.Shape.STRING, pattern =  "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime creationDate;

    public User(Long id, String name, String email, Long userTypeId, LocalDateTime creationDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.userTypeId = userTypeId;
        this.creationDate = creationDate;
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

    public Long getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Long userTypeId) {
        this.userTypeId = userTypeId;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
