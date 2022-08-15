package com.burak.hrms.business.abstracts;

import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Language;


import java.util.List;

public interface LanguageService {

    Result add(Language language);

    DataResult<List<Language>> getLanguagesByResumeId(int resumeId);

}
