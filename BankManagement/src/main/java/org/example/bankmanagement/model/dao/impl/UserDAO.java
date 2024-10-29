package org.example.bankmanagement.model.dao.impl;

import org.example.bankmanagement.model.dao.IUserDAO;
import org.example.bankmanagement.model.entity.Admin;
import org.example.bankmanagement.model.entity.User;
import org.example.bankmanagement.model.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDAO {
    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        Connection connection = JDBCConnection.getConnection();
        if (connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("select * from users");
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int userId = resultSet.getInt("user_id");
                    String fullName = resultSet.getString("full_name");
                    String phoneNumber = resultSet.getString("phone_number");
                    String email = resultSet.getString("email");
                    users.add(new User(userId, fullName, phoneNumber, email));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return users;
    }

    @Override
    public void addUser(User user) {
        Connection connection = JDBCConnection.getConnection();
        if (connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("INSERT INTO users (full_name, phone_number, email) VALUES (?, ?, ?);");
                preparedStatement.setString(1, user.getFullName());
                preparedStatement.setString(2, user.getPhoneNumber());
                preparedStatement.setString(3, user.getEmail());
                System.out.println(preparedStatement);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
