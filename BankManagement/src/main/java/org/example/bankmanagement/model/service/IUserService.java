package org.example.bankmanagement.model.service;

import org.example.bankmanagement.model.entity.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();
    void addUser(User user);
}
