package com.burak.hrms.business.concretes;

import com.burak.hrms.business.abstracts.ExperienceService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.core.utilities.results.SuccessDataResult;
import com.burak.hrms.core.utilities.results.SuccessResult;
import com.burak.hrms.dataAccess.abstracts.ExperienceDao;
import com.burak.hrms.entities.concretes.Experience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceManager implements ExperienceService{

    private ExperienceDao experienceDao;


    @Autowired
    public ExperienceManager(ExperienceDao experienceDao) {
        this.experienceDao = experienceDao;
    }

    @Override
    public Result add(Experience experience) {
        experienceDao.save(experience);
        return new SuccessResult("Başarılı ekleme.");
    }

    @Override
    public DataResult<List<Experience>> getExperiencesByResumeId(int resumeId) {
        return new SuccessDataResult<List<Experience>>(experienceDao.getExperiencesByResume_Id(resumeId),"Başarılı");
    }

    @Override
    public DataResult<List<Experience>> getSortedExperiencesByResumeId(int resumeId) {
        return new SuccessDataResult<List<Experience>>(experienceDao.getExperiencesByResume_IdOrderByEndDateDesc(resumeId),"Başarılı");
    }
}
