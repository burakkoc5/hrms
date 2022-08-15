package com.burak.hrms.api.controllers;

import com.burak.hrms.business.abstracts.CoverLetterService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.CoverLetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/coverLetters")
public class CoverLettersController {

    private CoverLetterService coverLetterService;

    @Autowired
    public CoverLettersController(CoverLetterService coverLetterService) {
        this.coverLetterService = coverLetterService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CoverLetter coverLetter) {

        return coverLetterService.add(coverLetter);
    }

    @GetMapping("/getCoverLetterByResumeId")
    public DataResult<CoverLetter> getCoverLetterByResumeId(@RequestParam int resumeId) {
        return coverLetterService.getCoverLetterByResumeId(resumeId);
    }
}
