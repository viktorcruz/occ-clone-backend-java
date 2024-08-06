package com.lastsys.hexagonal.occ_clone.domain.models;

import java.time.LocalDateTime;

public class ApplicantHistory {
    private Long id;
    private Long idApplicant;
    private Long idPublication;
    private String action;
    private LocalDateTime creationDate;

    public ApplicantHistory(Long id, Long idApplicant, Long idPublication, String action, LocalDateTime creationDate) {
        this.id = id;
        this.idApplicant = idApplicant;
        this.idPublication = idPublication;
        this.action = action;
        this.creationDate = creationDate;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdApplicant() {
        return idApplicant;
    }

    public void setIdApplicant(Long idApplicant) {
        this.idApplicant = idApplicant;
    }

    public Long getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(Long idPublication) {
        this.idPublication = idPublication;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
