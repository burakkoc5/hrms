package com.burak.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table(name="images")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Image {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="image_url")
    private String imageUrl;


    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
