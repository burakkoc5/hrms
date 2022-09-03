package com.burak.hrms.api.controllers;

import com.burak.hrms.business.abstracts.UserService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UsersController {

    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public DataResult<List<User>> getAll(){
        return userService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<User> getById(@RequestParam  int id){
        return userService.getById(id);
    }

    @GetMapping("/getByMail")
    public DataResult<User> getByMail(@RequestParam  String mail){
        return userService.getByMail(mail);
    }

}
