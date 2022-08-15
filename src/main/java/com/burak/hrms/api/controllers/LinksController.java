package com.burak.hrms.api.controllers;


import com.burak.hrms.business.abstracts.LinkService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/links")
public class LinksController {

    private LinkService linkService;

    @Autowired
    public LinksController(LinkService linkService) {
        this.linkService = linkService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Link link) {
        return linkService.add(link);
    }

    @GetMapping("/getLinksByResumeId")
    public DataResult<List<Link>> getLinksByResumeId(@RequestParam int resumeId) {
        return linkService.getLinksByResumeId(resumeId);
    }
}
