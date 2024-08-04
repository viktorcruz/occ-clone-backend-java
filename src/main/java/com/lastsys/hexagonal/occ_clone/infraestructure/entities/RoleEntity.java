package com.lastsys.hexagonal.occ_clone.infraestructure.entities;

import com.lastsys.hexagonal.occ_clone.domain.models.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roleName;

    public RoleEntity(){}
    public RoleEntity(Long id, String roleName){
        this.id = id;
        this.roleName = roleName;
    }

    public static RoleEntity fromDomainModel(Role role){
        return new RoleEntity(
                role.getId(),
                role.getRoleName()
        );
    }

    public Role toDomainModel(){return new Role(id, roleName);}

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public String getRoleName(){return roleName;}
    public void setRoleName(String roleName){this.roleName = roleName;}
}
