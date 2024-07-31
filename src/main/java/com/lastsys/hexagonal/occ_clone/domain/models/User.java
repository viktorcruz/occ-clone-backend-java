package com.lastsys.hexagonal.occ_clone.domain.models;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String name;
    private String email;
    private boolean userType;
    private LocalDateTime creationDate;

    public User(Long id, String name, String email, boolean userType, LocalDateTime creationDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.userType = userType;
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

    public boolean isUserType() {
        return userType;
    }

    public void setUserType(boolean userType) {
        this.userType = userType;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
