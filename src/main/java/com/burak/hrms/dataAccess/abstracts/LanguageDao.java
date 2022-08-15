package com.burak.hrms.dataAccess.abstracts;

import com.burak.hrms.entities.concretes.Language;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguageDao extends JpaRepository<Language,Integer> {

    List<Language> getLanguagesByResume_Id(int resumeId);
}
