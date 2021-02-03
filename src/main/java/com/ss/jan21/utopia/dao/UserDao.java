package com.ss.jan21.utopia.dao;

import com.ss.jan21.utopia.model.User;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class UserDao extends DbConnect<User> {

    public User getUserById(int userId) throws SQLException, ClassNotFoundException {
        return (User) read("SELECT * FROM user WHERE id = ?", new Object[] {userId});
    }

    // get user by username
    public User getUserName()
    // get user by email

    // get user by phone

    // get list of users by their role


}
