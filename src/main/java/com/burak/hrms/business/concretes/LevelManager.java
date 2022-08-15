package com.burak.hrms.business.concretes;

import com.burak.hrms.business.abstracts.LevelService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.core.utilities.results.SuccessDataResult;
import com.burak.hrms.core.utilities.results.SuccessResult;
import com.burak.hrms.dataAccess.abstracts.LevelDao;
import com.burak.hrms.entities.concretes.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LevelManager implements LevelService {

    private LevelDao levelDao;

    @Autowired
    public LevelManager(LevelDao levelDao) {
        this.levelDao = levelDao;
    }

    @Override
    public Result add(Level level) {
        levelDao.save(level);
        return new SuccessResult("Eklendi başarılı");
    }

    @Override
    public DataResult<List<Level>> getAll() {
        return new SuccessDataResult<List<Level>>(levelDao.findAll(),"Başarıyla listelendi");
    }
}
