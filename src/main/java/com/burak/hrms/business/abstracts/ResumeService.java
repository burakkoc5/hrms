package com.burak.hrms.business.abstracts;

import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Resume;

public interface ResumeService {

    Result add(Resume resume);

    DataResult<Resume> getResumeByEmployeeId(int employeeId);

    //ResumeWithFieldsDto getResumeWithFieldDetails(int employeeId);

}
