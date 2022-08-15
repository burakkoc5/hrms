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
@Table(name = "links")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resumes","link_names"})
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","link_names"})
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne()
    @JoinColumn(name = "resume_id")
    //@JsonIgnore()
    private Resume resume;

    @Column(name = "url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "link_name_id")//,referencedColumnName = "id")
    private LinkName linkName;

}
