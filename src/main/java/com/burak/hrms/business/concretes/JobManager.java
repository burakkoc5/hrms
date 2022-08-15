package com.burak.hrms.business.concretes;

import com.burak.hrms.business.abstracts.JobService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.core.utilities.results.SuccessDataResult;
import com.burak.hrms.core.utilities.results.SuccessResult;
import com.burak.hrms.dataAccess.abstracts.JobDao;
import com.burak.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {
    private JobDao jobDao;

    @Autowired
    public JobManager(JobDao jobDao) {
        this.jobDao = jobDao;
    }

    @Override
    public DataResult<List<Job>> getAll() {
        return new SuccessDataResult<List<Job>>(jobDao.findAll(),"Job listing is successful");
    }

    @Override
    public Result add(Job job) {
        this.jobDao.save(job);
        return new SuccessResult("New job successfully added.");
    }
}
