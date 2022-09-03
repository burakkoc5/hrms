package com.burak.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class Employee extends User{


    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="tck_number")
    private String tckNumber;

    @Column(name="birth_date")
    private LocalDate birthDate;
}
