package com.burak.hrms.api.controllers;

import com.burak.hrms.business.abstracts.EducationService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/educations")
@CrossOrigin
public class EducationsController {

    private EducationService educationService;


    @Autowired
    public EducationsController(EducationService educationService) {
        this.educationService = educationService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Education education) {
        return educationService.add(education);
    }

    @GetMapping("/getEducationsByResumeId")
    public DataResult<List<Education>> getEducationsByResumeId(@RequestParam int resumeId) {
        return educationService.getEducationsByResumeId(resumeId);
    }
    @GetMapping("/getEducationsByResumeIdSorted")
    public DataResult<List<Education>> getEducationsSortedByResumeId(int resumeId) {
        return educationService.getEducationsSortedByResumeId(resumeId);
    }
}
