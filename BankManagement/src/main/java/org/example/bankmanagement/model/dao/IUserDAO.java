package org.example.bankmanagement.model.dao;

import org.example.bankmanagement.model.entity.User;

import java.util.List;

public interface IUserDAO {
    List<User> getAllUsers();
    void addUser(User user);
    void deleteUserById(int userId);
    User getUserById(int userId);
}
