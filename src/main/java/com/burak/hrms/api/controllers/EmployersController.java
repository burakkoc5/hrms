package com.burak.hrms.api.controllers;

import com.burak.hrms.business.abstracts.EmployerService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
@CrossOrigin
public class EmployersController {

    private EmployerService employerService;

    @Autowired
    public EmployersController(EmployerService employerService) {
        this.employerService = employerService;
    }


    @GetMapping("/getAll")
    public DataResult<List<Employer>> getAll(){
        return employerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employer employer){
        return employerService.add(employer);
    }

    @GetMapping("/getByMail")
    public DataResult<Employer> getByMail(@RequestParam String mail){
        return employerService.getByMail(mail);
    }

    @GetMapping("/getById")
    public DataResult<Employer> getById(@RequestParam int id){
        return employerService.getById(id);
    }
}
