package com.burak.hrms.business.abstracts;

import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Experience;


import java.util.List;

public interface ExperienceService {

    Result add(Experience experience);

    DataResult<List<Experience>> getExperiencesByResumeId(int resumeId);

    DataResult<List<Experience>> getSortedExperiencesByResumeId(int resumeId);


}
