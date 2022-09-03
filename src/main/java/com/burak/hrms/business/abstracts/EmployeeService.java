package com.burak.hrms.business.abstracts;

import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {

    public DataResult<List<Employee>> getAll();
    public Result add(Employee employee);

    public DataResult<Employee> getByMail(String mail);

    public DataResult<Employee> getById(int id);


}
