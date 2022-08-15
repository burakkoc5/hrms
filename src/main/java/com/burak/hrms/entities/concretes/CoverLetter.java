package com.burak.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cover_letters")
public class CoverLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne()
    @JoinColumn(name = "resume_id")
    //@JsonIgnore()
    private Resume resume;

    @Column(name = "letter_message")
    private String letterMessage;

}
