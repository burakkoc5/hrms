package com.burak.hrms.dataAccess.abstracts;

import com.burak.hrms.entities.concretes.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDao extends JpaRepository<Job,Integer> {

}
