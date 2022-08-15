package com.burak.hrms.api.controllers;

import com.burak.hrms.business.abstracts.JobService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

    private JobService jobService;

    @Autowired
    public JobsController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Job>> getAllJobs(){
        return jobService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Job job){

        return jobService.add(job);
    }
}
