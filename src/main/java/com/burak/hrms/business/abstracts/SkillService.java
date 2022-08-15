package com.burak.hrms.business.abstracts;

import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Skill;

import java.util.List;

public interface SkillService {

    Result add(Skill skill);

    DataResult<List<Skill>> getSkillsByResume_Id(int resumeId);

}
