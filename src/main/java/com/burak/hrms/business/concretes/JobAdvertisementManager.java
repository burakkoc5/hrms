package com.burak.hrms.business.concretes;

import com.burak.hrms.business.abstracts.JobAdvertisementService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.core.utilities.results.SuccessDataResult;
import com.burak.hrms.core.utilities.results.SuccessResult;
import com.burak.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.burak.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

    private JobAdvertisementDao jobAdvertisementDao;

    @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
    }


    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAll(),"Tüm iş ilanları listelendi");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllSorted(){
        Sort sort = Sort.by(Sort.Direction.ASC,"dueDate");//artan
        return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAll(sort),"Tüm iş ilanları tarih sırasına göre listelendi");
    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
        jobAdvertisement.setPostingDate(LocalDate.now());
        jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("İş ilanı eklendi");
    }

    @Override
    public Result update(JobAdvertisement jobAdvertisement) {
        jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("İş ilanı eklendi");
    }

    @Override
    public DataResult<JobAdvertisement> getById(int id) {
        return new SuccessDataResult<JobAdvertisement>(jobAdvertisementDao.getJobAdvertisementById(id),"İş ilanı getirildi.");
    }
    @Override
    public DataResult<List<JobAdvertisement>> getByCityId(int cityId) {
        return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.getByCity_Id(cityId),"Tüm iş ilanları id ye göre listelendi");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByCityId2(int cityId) {
        return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.getJobAdvertisementByCity_Id(cityId),"Tüm iş ilanları id ye göre listelendi");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByEmployerId(int employerId) {
        return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.getJobAdvertisementByEmployer_Id(employerId),"Tüm iş ilanları şirkete göre listelendi");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getJobAdvertisementByStatus(boolean status) {
        return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.getJobAdvertisementByStatus(status),"Aktif tüm iş ilanları listelendi");

    }

    @Override
    public DataResult<List<JobAdvertisement>> getJobAdvertisementByStatusAndEmployer_Id(boolean status, int employerId) {
        return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.getJobAdvertisementByStatusAndEmployer_Id(status,employerId),"Aktif tüm iş ilanları  şirkete göre listelendi");

    }


    @Override
    public Result makeActiveOrPassive(int id, boolean isActive) {

        String statusMessage = isActive
                ? "İlan aktifleştirildi."
                : "İlan pasifleştirildi.";

        JobAdvertisement jobAdvertisement = getById(id).getData();
        jobAdvertisement.setStatus(isActive);

        update(jobAdvertisement);
        return new SuccessResult(statusMessage);
    }
}
