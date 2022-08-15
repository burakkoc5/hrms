package com.burak.hrms.business.abstracts;

import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Job;
import org.springframework.stereotype.Service;

import java.util.List;


public interface JobService {

    DataResult<List<Job>> getAll();

    Result add(Job job);

}
