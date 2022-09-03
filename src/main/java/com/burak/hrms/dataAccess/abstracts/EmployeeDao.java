package com.burak.hrms.dataAccess.abstracts;

import com.burak.hrms.entities.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {

    Employee getEmployeeByMail(String mail);

    Employee getEmployeeById(int id);
}
