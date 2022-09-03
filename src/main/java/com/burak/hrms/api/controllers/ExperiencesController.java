package com.burak.hrms.api.controllers;

import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.business.abstracts.ExperienceService;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Experience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experiences")
@CrossOrigin
public class ExperiencesController {

    private ExperienceService experienceService;

    @Autowired
    public ExperiencesController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Experience experience) {
        //experienceService.add(experience);
        return experienceService.add(experience);
    }

    @GetMapping("/getExperiencesByResumeId")
    public DataResult<List<Experience>> getExperiencesByResumeId(@RequestParam int resumeId) {
        return experienceService.getExperiencesByResumeId(resumeId);
    }

    @GetMapping("/getSortedExperiencesByResumeId")
    public DataResult<List<Experience>> getSortedExperiencesByResumeId(@RequestParam int resumeId) {
        return experienceService.getSortedExperiencesByResumeId(resumeId);
    }
}
