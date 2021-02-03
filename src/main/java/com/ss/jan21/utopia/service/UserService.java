package com.ss.jan21.utopia.service;

import com.ss.jan21.utopia.dao.UserDao;
import com.ss.jan21.utopia.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class UserService {

    @Autowired
    UserDao userDao;

    public User getUserById(int userId) throws SQLException, ClassNotFoundException {
        return userDao.getUserById(userId);
    }
}
