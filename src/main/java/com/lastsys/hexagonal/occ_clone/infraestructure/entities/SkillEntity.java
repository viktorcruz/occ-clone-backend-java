package com.lastsys.hexagonal.occ_clone.infraestructure.entities;

import com.lastsys.hexagonal.occ_clone.domain.models.Skill;
import jakarta.persistence.*;

@Entity
@Table(name ="skill")
public class SkillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name ="idCv", nullable = false)
    private CVEntity cv;
    private String skills;

    public SkillEntity(){}

    public SkillEntity(Long id, CVEntity cv, String skills){
        this.id = id;
        this.cv = cv;
        this.skills = skills;
    }

    public static SkillEntity fromDomainModel(Skill skill, CVEntity cvEntity){
        return new SkillEntity(
                skill.getId(),
                cvEntity,
                skill.getSkills()
        );
    }

    public Skill toDomainModel(){
        return new Skill(
                this.id,
                this.cv.getId(),
                this.skills
        );
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CVEntity getCv() {
        return cv;
    }

    public void setCv(CVEntity cv) {
        this.cv = cv;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
