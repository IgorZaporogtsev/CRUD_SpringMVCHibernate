package com.customer.store.dao;

import com.customer.store.model.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    List<User> getAllUser();
    void deleteUser(int id);
    void addUser(User user);
    User getUserById(int id);
    User getUserByLogin (String login);
    void updateUser (User user);
}
