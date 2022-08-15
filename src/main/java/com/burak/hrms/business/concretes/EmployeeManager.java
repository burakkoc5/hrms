package com.burak.hrms.business.concretes;

import com.burak.hrms.business.abstracts.EmployeeService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.core.utilities.results.SuccessDataResult;
import com.burak.hrms.core.utilities.results.SuccessResult;
import com.burak.hrms.dataAccess.abstracts.EmployeeDao;
import com.burak.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeManager(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public DataResult<List<Employee>> getAll() {
        return new SuccessDataResult<>(employeeDao.findAll(),"başarılı");
    }

    @Override
    public Result add(Employee employee) {
        employeeDao.save(employee);
        return new SuccessResult("işlem başarılı");
    }
}
