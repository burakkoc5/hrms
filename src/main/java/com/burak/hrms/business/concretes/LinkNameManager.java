package com.burak.hrms.business.concretes;

import com.burak.hrms.business.abstracts.LinkNameService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.core.utilities.results.SuccessDataResult;
import com.burak.hrms.core.utilities.results.SuccessResult;
import com.burak.hrms.dataAccess.abstracts.LinkNameDao;
import com.burak.hrms.entities.concretes.LinkName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkNameManager implements LinkNameService {

    private LinkNameDao linkNameDao;

    @Autowired
    public LinkNameManager(LinkNameDao linkNameDao) {
        this.linkNameDao = linkNameDao;
    }

    @Override
    public Result add(LinkName linkName) {
        linkNameDao.save(linkName);
        return new SuccessResult("Başarıyla eklendi");
    }

    @Override
    public DataResult<List<LinkName>> getAll() {
        return new SuccessDataResult<List<LinkName>>(linkNameDao.findAll(),"Başarıyla listelendi.");
    }
}
