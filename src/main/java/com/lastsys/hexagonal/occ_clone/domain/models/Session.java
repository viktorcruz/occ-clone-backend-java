package com.lastsys.hexagonal.occ_clone.domain.models;

import java.time.LocalDateTime;

public class Session {
    private Long id;
    private Long idUser;
    private String action;
    private LocalDateTime loginDate;
    private LocalDateTime logoutDate;

    public Session(Long id, Long idUser, String action, LocalDateTime loginDate, LocalDateTime logoutDate){
        this.id = id;
        this.idUser = idUser;
        this.action = action;
        this.loginDate = loginDate;
        this.logoutDate = logoutDate;
    }

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public Long getIdUser(){return idUser;}
    public void setIdUser(Long idUser){this.idUser = idUser;}
    public String getAction(){return action;}
    public void setAction(String action){this.action = action;}
    public LocalDateTime getLoginDate(){return loginDate;}
    public void setLoginDate(LocalDateTime loginDate){this.loginDate = loginDate;}
    public LocalDateTime getLogoutDate(){return logoutDate;}
    public void setLogoutDate(LocalDateTime logoutDate){this.logoutDate = logoutDate;}
}
