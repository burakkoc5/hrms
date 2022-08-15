package com.burak.hrms.business.concretes;

import com.burak.hrms.business.abstracts.SkillService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.core.utilities.results.SuccessDataResult;
import com.burak.hrms.core.utilities.results.SuccessResult;
import com.burak.hrms.dataAccess.abstracts.SkillDao;
import com.burak.hrms.entities.concretes.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillManager implements SkillService {

    private SkillDao skillDao;

    @Autowired
    public SkillManager(SkillDao skillDao) {
        this.skillDao = skillDao;
    }

    @Override
    public Result add(Skill skill) {
        skillDao.save(skill);
        return new SuccessResult("Başarıyla eklendi");
    }

    @Override
    public DataResult<List<Skill>> getSkillsByResume_Id(int resumeId) {
        return new SuccessDataResult<List<Skill>>(skillDao.getSkillsByResume_Id(resumeId),"Başarılı");
    }
}
