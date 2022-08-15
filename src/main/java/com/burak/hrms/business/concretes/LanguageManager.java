package com.burak.hrms.business.concretes;

import com.burak.hrms.business.abstracts.LanguageService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.core.utilities.results.SuccessDataResult;
import com.burak.hrms.core.utilities.results.SuccessResult;
import com.burak.hrms.dataAccess.abstracts.LanguageDao;
import com.burak.hrms.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LanguageManager implements LanguageService {

    private LanguageDao languageDao;

    @Autowired
    public LanguageManager(LanguageDao languageDao) {
        this.languageDao = languageDao;
    }

    @Override
    public Result add(Language language) {
        languageDao.save(language);
        return new SuccessResult("eklendi");
    }

    @Override
    public DataResult<List<Language>> getLanguagesByResumeId(int resumeId) {
        return new SuccessDataResult<List<Language>>(languageDao.getLanguagesByResume_Id(resumeId),"Başarılı");
    }
}
