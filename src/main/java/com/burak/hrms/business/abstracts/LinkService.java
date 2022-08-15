package com.burak.hrms.business.abstracts;

import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Link;

import java.util.List;

public interface LinkService {

    Result add(Link link);

    DataResult<List<Link>> getLinksByResumeId(int resumeId);

}
