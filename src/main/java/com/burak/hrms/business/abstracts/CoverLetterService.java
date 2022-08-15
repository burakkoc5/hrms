package com.burak.hrms.business.abstracts;

import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.CoverLetter;

public interface CoverLetterService {

    Result add(CoverLetter coverLetter);

    DataResult<CoverLetter> getCoverLetterByResumeId(int resumeId);

}
