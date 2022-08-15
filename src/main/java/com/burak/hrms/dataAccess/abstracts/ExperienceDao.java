package com.burak.hrms.dataAccess.abstracts;

import com.burak.hrms.entities.concretes.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExperienceDao extends JpaRepository<Experience,Integer> {

    List<Experience> getExperiencesByResume_Id(int resumeId);

    List<Experience> getExperiencesByResume_IdOrderByEndDateDesc(int resumeId);
}
