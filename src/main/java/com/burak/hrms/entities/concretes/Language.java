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
@Table(name = "languages")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resumes"})

public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "language_name")
    private String languageName;

    /*@Column(name = "level_id")
    private int levelId;*/

    @ManyToOne()
    @JoinColumn(name = "resume_id")
    //@JsonIgnore()
    private Resume resume;



    @ManyToOne()
    @JoinColumn(name = "level_id", nullable = false)
    private Level level;

}
