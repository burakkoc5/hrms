package com.burak.hrms.business.concretes;


import com.burak.hrms.business.abstracts.CoverLetterService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.core.utilities.results.SuccessDataResult;
import com.burak.hrms.core.utilities.results.SuccessResult;
import com.burak.hrms.dataAccess.abstracts.CoverLetterDao;
import com.burak.hrms.entities.concretes.CoverLetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoverLetterManager implements CoverLetterService {

    private CoverLetterDao coverLetterDao;

    @Autowired
    public CoverLetterManager(CoverLetterDao coverLetterDao) {
        this.coverLetterDao = coverLetterDao;
    }

    @Override
    public Result add(CoverLetter coverLetter) {

        coverLetterDao.save(coverLetter);

        return new SuccessResult("Ekleme başarılı");
    }

    @Override
    public DataResult<CoverLetter> getCoverLetterByResumeId(int resumeId) {
        return new SuccessDataResult<CoverLetter>(coverLetterDao.getCoverLetterByResume_Id(resumeId),"Bşarılı");
    }
}
