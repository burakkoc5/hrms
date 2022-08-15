package com.burak.hrms.business.concretes;

import com.burak.hrms.business.abstracts.LinkService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.core.utilities.results.SuccessDataResult;
import com.burak.hrms.core.utilities.results.SuccessResult;
import com.burak.hrms.dataAccess.abstracts.LinkDao;
import com.burak.hrms.entities.concretes.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkManager implements LinkService {

    private LinkDao linkDao;

    @Autowired
    public LinkManager(LinkDao linkDao) {
        this.linkDao = linkDao;
    }

    @Override
    public Result add(Link link) {
        linkDao.save(link);
        return new SuccessResult("Başarılı");
    }

    @Override
    public DataResult<List<Link>> getLinksByResumeId(int resumeId) {
        return new SuccessDataResult<List<Link>>(linkDao.getLinksByResume_Id(resumeId),"Başarılı");
    }
}
