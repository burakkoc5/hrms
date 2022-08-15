package com.burak.hrms.api.controllers;


import com.burak.hrms.business.abstracts.ResumeService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/resumes")
public class ResumesController {

    private ResumeService resumeService;

    @Autowired
    public ResumesController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }


    @PostMapping("/add")
    public Result add(@RequestBody Resume resume) {
        return resumeService.add(resume);
    }

    @GetMapping("/getResumeByEmployeeId")
    public DataResult<Resume> getResumeByEmployeeId(@RequestParam int employeeId) {
        return resumeService.getResumeByEmployeeId(employeeId);
    }

    /*@GetMapping("/getResumeDetailsByEmployeeId")
    public ResumeWithFieldsDto getResumeWithFieldDetails(@RequestParam int employeeId){
        return resumeService.getResumeWithFieldDetails(employeeId);
    }*/
}
