package com.burak.hrms.dataAccess.abstracts;

import com.burak.hrms.entities.concretes.CoverLetter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoverLetterDao extends JpaRepository<CoverLetter,Integer> {

    CoverLetter getCoverLetterByResume_Id(int resumeId);


}
