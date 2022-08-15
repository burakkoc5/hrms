package com.burak.hrms.api.controllers;

import com.burak.hrms.business.abstracts.EmployeeService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Employee>> getAll(){
        return employeeService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employee employee){
        return employeeService.add(employee);
    }
}
