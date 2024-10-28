package org.example.mvcjdbc.service.impl;

import org.example.mvcjdbc.dao.IUserDAO;
import org.example.mvcjdbc.dao.impl.UserDAO;
import org.example.mvcjdbc.model.User;
import org.example.mvcjdbc.service.IUserService;

import java.util.List;

public class UserService implements IUserService {
    private IUserDAO userDAO = new UserDAO();

    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public boolean addNewUser(User user) {
        return false;
    }

    @Override
    public boolean editUser(User user) {
        return false;
    }

    @Override
    public boolean removeUser(int id) {
        return false;
    }
}
