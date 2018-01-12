package com.codegile.university.api.controller;

import com.codegile.university.repository.model.User;
import com.codegile.university.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getString() {
        return "Hello World!";
    }

    @RequestMapping(path = "/users/create", method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }
}
