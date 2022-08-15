package com.burak.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_advertisements")
public class JobAdvertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="posting_date")
    private LocalDate postingDate;

    @Column(name="due_date")
    private LocalDate dueDate;

    @Column(name="min_salary")
    private String minSalary;

    @Column(name="max_salary")
    private String maxSalary;

    @Column(name="expectations")
    private String expectations;

    @Column(name="open_positions")
    private int openPositions;

    @Column(name="status")
    private boolean status;

    @ManyToOne()
    @JoinColumn(name = "city_id",nullable = false)
    private City city;

    @ManyToOne()
    @JoinColumn(name = "job_id",nullable = false)
    private Job job;

    @ManyToOne()
    @JoinColumn(name = "employer_id",nullable = false)
    private Employer employer;





}
