package com.burak.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "resumes")
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne()
    @JoinColumn(name = "employee_id",nullable = false)
    private Employee employee;


    @JsonIgnore
    @OneToMany(mappedBy = "resume")
    private List<Link> links;

    @JsonIgnore
    @OneToOne(mappedBy = "resume")
    private CoverLetter coverLetters;

    @JsonIgnore
    @OneToMany(mappedBy = "resume")
    private List<Language> languages;

    @JsonIgnore
    @OneToMany(mappedBy = "resume")
    private List<Education> educations;

    @JsonIgnore
    @OneToMany(mappedBy = "resume")
    private List<Skill> skills;

    @JsonIgnore
    @OneToMany(mappedBy = "resume")
    private List<Experience> experiences;


}
