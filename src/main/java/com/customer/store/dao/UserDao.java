package com.customer.store.dao;

import com.customer.store.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();

    void addUser(User user);
    void updateUser (User user);

    void deleteUser(int id);

    User getUserById(int id);
    User getUserByLogin (String login);
}
