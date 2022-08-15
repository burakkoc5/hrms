package com.burak.hrms.dataAccess.abstracts;


import com.burak.hrms.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

    User getByMail(String mail);

    User getById(int id);


}
