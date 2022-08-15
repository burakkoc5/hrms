package com.burak.hrms.api.controllers;

import com.burak.hrms.business.abstracts.SkillService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {

    private SkillService skillService;

    @Autowired
    public SkillsController(SkillService skillService) {
        this.skillService = skillService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Skill skill) {

        return skillService.add(skill);
    }

    @GetMapping("/getSkillsByResumeId")
    public DataResult<List<Skill>> getSkillsByResumeId(@RequestParam int resumeId) {
        return skillService.getSkillsByResume_Id(resumeId);
    }


}
