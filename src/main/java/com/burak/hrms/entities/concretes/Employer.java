package com.burak.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="employers")
@PrimaryKeyJoinColumn(name="user_id",referencedColumnName = "id")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class Employer extends User{

    @Column(name="company_name")
    private String companyName;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="company_website")
    private String webAddress;

    //@OneToMany(mappedBy = "employer")
    //private List<JobAdvertisement> jobAdvertisements;


}
