package com.burak.hrms.dataAccess.abstracts;

import com.burak.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer,Integer> {

    Employer getEmployerByMail(String mail);

    Employer getEmployerById(int id);
}
