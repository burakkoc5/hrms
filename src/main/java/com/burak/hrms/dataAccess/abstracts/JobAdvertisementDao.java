package com.burak.hrms.dataAccess.abstracts;

import com.burak.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {

    List<JobAdvertisement> getJobAdvertisementByCity_Id(int cityId);

    List<JobAdvertisement>  getByCity_Id(int cityId);

    List<JobAdvertisement>  getJobAdvertisementByEmployer_Id(int employerId);

    List<JobAdvertisement> getJobAdvertisementByStatus(boolean status);
    List<JobAdvertisement> getJobAdvertisementByStatusAndEmployer_Id(boolean status,int employerId);

    JobAdvertisement getJobAdvertisementById(int id);
}
