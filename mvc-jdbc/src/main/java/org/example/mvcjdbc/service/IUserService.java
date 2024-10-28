package org.example.mvcjdbc.service;

import org.example.mvcjdbc.model.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUser();
    User getUser(int id);
    boolean addNewUser(User user);
    boolean editUser(User user);
    boolean removeUser(int id);
}
