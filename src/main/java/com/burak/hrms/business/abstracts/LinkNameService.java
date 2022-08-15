package com.burak.hrms.business.abstracts;

import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.LinkName;

import java.util.List;

public interface LinkNameService {

    Result add(LinkName linkName);

    DataResult<List<LinkName>> getAll();
}
