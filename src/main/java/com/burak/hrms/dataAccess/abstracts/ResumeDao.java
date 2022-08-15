package com.burak.hrms.dataAccess.abstracts;

import com.burak.hrms.entities.concretes.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeDao extends JpaRepository<Resume,Integer> {

    Resume getResumeByEmployee_Id(int employeeId);


    /*@Query(value = "Select new com.example.cvdeneme.entities.dtos.ResumeWithFieldsDto" +
            "(r.id,cl.letterMessage,e,ex,l,li,sk) " +
            "From Resume r Inner Join CoverLetter cl on r.id =cl.resume.id " +
            "inner JOIN Education e on r.id =e.resume.id inner Join Experience ex on r.id =ex.resume.id inner Join Language l on r.id =l.resume.id inner Join Link li on r.id =li.resume.id inner Join Skill sk on r.id=sk.resume.id")
    ResumeWithFieldsDto getResumeWithFieldDetails(int employeeId);*/


    /*private int id; WHERE r.employee.id =:employeeId

    private String letterMessage;

    private String educationalInstitution;
    private LocalDate startDate;
    private LocalDate endDate;
    private String department;

    private String workPlace;
    private LocalDate workStartDate;
    private LocalDate workEndDate;
    private String position;
    private String description;

    private String languageName;

    //private int url;

    private int skillName;*/
}
