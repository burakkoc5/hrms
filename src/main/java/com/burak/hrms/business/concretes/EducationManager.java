package com.burak.hrms.business.concretes;

import com.burak.hrms.business.abstracts.EducationService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.core.utilities.results.SuccessDataResult;
import com.burak.hrms.core.utilities.results.SuccessResult;
import com.burak.hrms.dataAccess.abstracts.EducationDao;
import com.burak.hrms.entities.concretes.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationManager implements EducationService {

    private EducationDao educationDao;


    @Autowired
    public EducationManager(EducationDao educationDao) {
        this.educationDao = educationDao;
    }

    @Override
    public Result add(Education education) {
        educationDao.save(education);
        return new SuccessResult("Ekleme işlemi başarılı");
    }

    @Override
    public DataResult<List<Education>> getEducationsByResumeId(int resumeId) {
        return new SuccessDataResult<List<Education>> (educationDao.getEducationsByResume_Id(resumeId),"Başarılı");
    }

    @Override
    public DataResult<List<Education>> getEducationsSortedByResumeId(int resumeId) {
        return new SuccessDataResult<List<Education>>(educationDao.getEducationsByResume_IdOrderByEndDateDesc(resumeId),"Başarılı");
    }
}
