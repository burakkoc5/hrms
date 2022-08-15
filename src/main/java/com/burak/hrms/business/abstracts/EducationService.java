package com.burak.hrms.business.abstracts;

import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Education;


import java.util.List;

public interface EducationService {

    Result add (Education education);

    DataResult<List<Education>> getEducationsByResumeId(int resumeId);


    DataResult<List<Education>> getEducationsSortedByResumeId(int resumeId);
}
