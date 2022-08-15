package com.burak.hrms.business.concretes;

import com.burak.hrms.business.abstracts.ResumeService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.core.utilities.results.SuccessDataResult;
import com.burak.hrms.core.utilities.results.SuccessResult;
import com.burak.hrms.dataAccess.abstracts.ResumeDao;
import com.burak.hrms.entities.concretes.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeManager implements ResumeService {

    private ResumeDao resumeDao;

    @Autowired
    public ResumeManager(ResumeDao resumeDao) {
        this.resumeDao = resumeDao;
    }

    @Override
    public Result add(Resume resume) {
        resumeDao.save(resume);
        return new SuccessResult("Başarıyla eklendi");
    }

    @Override
    public DataResult<Resume> getResumeByEmployeeId(int employeeId) {
        return new SuccessDataResult<Resume>(resumeDao.getResumeByEmployee_Id(employeeId),"Başarılı");
    }


   /* @Override
    public ResumeWithFieldsDto getResumeWithFieldDetails(int employeeId){
        return resumeDao.getResumeWithFieldDetails(employeeId);
    }*/



}
