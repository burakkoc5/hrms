package com.burak.hrms.api.controllers;

import com.burak.hrms.business.abstracts.LinkNameService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.LinkName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/linkNames")
public class LinkNamesController {

    private LinkNameService linkNameService;

    @Autowired
    public LinkNamesController(LinkNameService linkNameService) {
        this.linkNameService = linkNameService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody LinkName linkName) {
        return linkNameService.add(linkName);
    }

    @GetMapping("/getAll")
    public DataResult<List<LinkName>> getAll() {
        return linkNameService.getAll();
    }
}
