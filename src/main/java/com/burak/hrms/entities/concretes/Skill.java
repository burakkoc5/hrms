package com.burak.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "skills")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resumes"})
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "skill_name")
    private String skillName;

    @ManyToOne()
    @JoinColumn(name = "resume_id")
    //@JsonIgnore()
    private Resume resume;

    @Column(name = "level_id")
    private int levelId;
}
