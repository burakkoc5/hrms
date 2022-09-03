package com.burak.hrms.api.controllers;

import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.business.abstracts.LanguageService;
import com.burak.hrms.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
@CrossOrigin
public class LanguagesController {
    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Language language) {
        return languageService.add(language);
    }

    @GetMapping("/getLanguagesByResumeId")
    public DataResult<List<Language>> getLanguagesByResumeId(@RequestParam int resumeId) {
        return languageService.getLanguagesByResumeId(resumeId);
    }



}
