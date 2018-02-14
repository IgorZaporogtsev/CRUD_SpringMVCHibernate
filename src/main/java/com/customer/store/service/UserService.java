package com.customer.store.service;
import com.customer.store.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(int id);
    User getUserByLogin(String login);
    void addUser(User user);
   void updateUser(User user);
   void deleteUser(int id);
}
