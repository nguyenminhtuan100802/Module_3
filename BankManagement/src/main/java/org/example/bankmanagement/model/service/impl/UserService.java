package org.example.bankmanagement.model.service.impl;

import org.example.bankmanagement.model.dao.IUserDAO;
import org.example.bankmanagement.model.dao.impl.UserDAO;
import org.example.bankmanagement.model.entity.User;
import org.example.bankmanagement.model.service.IUserService;

import java.util.List;

public class UserService implements IUserService {
    IUserDAO userDAO = new UserDAO();
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }
}
