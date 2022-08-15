package com.burak.hrms.dataAccess.abstracts;

import com.burak.hrms.entities.concretes.Education;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EducationDao extends JpaRepository<Education,Integer> {

    List<Education> getEducationsByResume_Id(int resumeId);


    List<Education> getEducationsByResume_IdOrderByEndDateDesc(int resumeId);
}
