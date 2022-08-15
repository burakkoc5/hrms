package com.burak.hrms.business.concretes;

import com.burak.hrms.business.abstracts.UserService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.SuccessDataResult;
import com.burak.hrms.dataAccess.abstracts.UserDao;
import com.burak.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>(userDao.findAll(),"başarılı");
    }

    @Override
    public DataResult<User> getById(int id) {
        return new SuccessDataResult<User>(userDao.getById(id),"başarılı");
    }

    @Override
    public DataResult<User> getByMail(String mail) {
        return new SuccessDataResult<User>(userDao.getByMail(mail));
    }
}
