package com.burak.hrms.api.controllers;


import com.burak.hrms.business.abstracts.LevelService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/levels")
@RestController
@CrossOrigin
public class LevelsController {

    private LevelService levelService;

    @Autowired
    public LevelsController(LevelService levelService) {
        this.levelService = levelService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Level level) {
        return levelService.add(level);
    }

    @GetMapping("/getAll")
    public DataResult<List<Level>> getAll() {
        return levelService.getAll();
    }
}
