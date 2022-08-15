package com.burak.hrms.business.abstracts;

import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.entities.concretes.User;

import java.util.List;

public interface UserService {

    DataResult<List<User>> getAll();

    DataResult<User> getById(int id);

    DataResult<User> getByMail(String email);

}
