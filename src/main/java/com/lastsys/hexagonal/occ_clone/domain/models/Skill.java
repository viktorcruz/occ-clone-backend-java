package com.lastsys.hexagonal.occ_clone.domain.models;

public class Skill {
    private Long id;
    private Long idCv;
    private String skills;

    public Skill(Long id, Long idCv, String skills){
        this.id = id;
        this.idCv = idCv;
        this.skills = skills;
    }

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public Long getIdCv(){return idCv;}
    public void setIdCv(Long idCv){this.idCv = idCv;}
    public String getSkills(){return skills;}
    public void setSkills(String skills){this.skills = skills;}
}
