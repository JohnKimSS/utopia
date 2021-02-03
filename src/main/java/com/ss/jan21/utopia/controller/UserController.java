package com.ss.jan21.utopia.controller;

import com.ss.jan21.utopia.model.User;
import com.ss.jan21.utopia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, path = "/lms/users/{userId}")
    public User getUserById(@PathVariable int userId) throws SQLException, ClassNotFoundException {
        return userService.getUserById(userId);
    }
}
