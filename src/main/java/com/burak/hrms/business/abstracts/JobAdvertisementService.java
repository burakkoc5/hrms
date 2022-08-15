package com.burak.hrms.business.abstracts;

import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.JobAdvertisement;

import java.util.List;

public interface JobAdvertisementService {

    DataResult<List<JobAdvertisement>> getAll();

    DataResult<List<JobAdvertisement>> getAllSorted();

    Result add(JobAdvertisement jobAdvertisement);

    public Result update(JobAdvertisement jobAdvertisement);

    DataResult<List<JobAdvertisement>> getByCityId(int cityId);

    DataResult<List<JobAdvertisement>> getByCityId2(int cityId);

    DataResult<List<JobAdvertisement>> getByEmployerId(int employerId);

    DataResult<List<JobAdvertisement>> getJobAdvertisementByStatus(boolean status);

    DataResult<List<JobAdvertisement>> getJobAdvertisementByStatusAndEmployer_Id(boolean status,int employerId);

    DataResult<JobAdvertisement> getById(int id);
    public Result makeActiveOrPassive(int id, boolean isActive);


}
