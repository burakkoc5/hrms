package com.burak.hrms.api.controllers;


import com.burak.hrms.business.abstracts.JobAdvertisementService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.core.utilities.results.SuccessDataResult;
import com.burak.hrms.core.utilities.results.SuccessResult;
import com.burak.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobAdvertisements")
@CrossOrigin
public class JobAdvertisementsController {

    private JobAdvertisementService jobAdvertisementService;

    @Autowired
    public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }


    @GetMapping("/getAll")
    public DataResult<List<JobAdvertisement>> getAll() {
        return jobAdvertisementService.getAll();
    }
    @GetMapping("/getAllSortedByDate")
    public DataResult<List<JobAdvertisement>> getAllSorted(){
        return jobAdvertisementService.getAllSorted();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobAdvertisement jobAdvertisement) {

        return jobAdvertisementService.add(jobAdvertisement);
    }

    @GetMapping("/getByCityId")
    public DataResult<List<JobAdvertisement>> getByCityId(@RequestParam int cityId) {
        return jobAdvertisementService.getByCityId(cityId);
    }

    @GetMapping("/getById")
    public DataResult<JobAdvertisement> getById(@RequestParam int id) {
        return jobAdvertisementService.getById(id);
    }

    @GetMapping("/getByCityId2")
    public DataResult<List<JobAdvertisement>> getByCityId2(@RequestParam int cityId) {
        return jobAdvertisementService.getByCityId2(cityId);
    }

    @GetMapping("/getByEmployerId")
    public DataResult<List<JobAdvertisement>> getByEmployerId(@RequestParam int employerId) {
        return jobAdvertisementService.getByEmployerId(employerId);
    }
    @GetMapping("/getJobAdvertisementByStatus")
    public DataResult<List<JobAdvertisement>> getJobAdvertisementByStatus(@RequestParam boolean status) {
        return jobAdvertisementService.getJobAdvertisementByStatus(status);
    }

    @GetMapping("/getJobAdvertisementByStatusAndEmployerId")
    public DataResult<List<JobAdvertisement>> getJobAdvertisementByStatusAndEmployer_Id(@RequestParam boolean status,@RequestParam int employerId) {
        return jobAdvertisementService.getJobAdvertisementByStatusAndEmployer_Id(status,employerId);
    }

    @PutMapping("/makeActiveOrPassive")
    public Result makeActiveOrPassive(@RequestParam int id, @RequestParam boolean isActive) {
        return jobAdvertisementService.makeActiveOrPassive(id, isActive);
    }
}
