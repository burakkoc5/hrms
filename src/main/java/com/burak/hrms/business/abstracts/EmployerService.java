package com.burak.hrms.business.abstracts;

import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    public DataResult<List<Employer>> getAll();

    public Result add(Employer employer);
    public DataResult<Employer> getByMail(String mail);
    public DataResult<Employer> getById(int id);

}
