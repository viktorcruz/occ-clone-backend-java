package com.lastsys.hexagonal.occ_clone.infraestructure.entities;


import com.lastsys.hexagonal.occ_clone.domain.models.Session;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "session")
public class SessionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name ="idUser", nullable = false)
    private UserEntity user;

    private String action;
    private LocalDateTime loginDate;
    private LocalDateTime logoutDate;


    public SessionEntity(){}
    public SessionEntity(Long id, UserEntity user, String action, LocalDateTime loginDate, LocalDateTime logoutDate){
        this.id = id;
        this.user = user;
        this.action = action;
        this.loginDate = loginDate;
        this.logoutDate = logoutDate;
    }

    public static SessionEntity fromDomainModel(Session session, UserEntity userEntity){
        return new SessionEntity(
                session.getId(),
                userEntity,
                session.getAction(),
                session.getLoginDate(),
                session.getLogoutDate()
        );
    }

    public Session toDomainModel(){
        return new Session(
                this.id,
                this.user.getId(),
                this.action,
                this.loginDate,
                this.logoutDate
        );
    }


    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public UserEntity getUser(){return user;}
    public void setUser(UserEntity userEntity){this.user = userEntity;}
    public LocalDateTime getLoginDate(){return loginDate;}
    public void setLoginDate(LocalDateTime loginDate){this.loginDate = loginDate;}
    public LocalDateTime getLogoutDate(){return logoutDate;}
    public void setLogoutDate(LocalDateTime logoutDate){this.logoutDate = logoutDate;}

}
