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
                    String userName = resultSet.getString("user_name");
                    String password = resultSet.getString("password");
                    users.add(new User(userId, fullName, phoneNumber, email, userName, password));
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
            user.setUserName(user.getPhoneNumber());
            user.setPassword(user.getPhoneNumber());
            try {
                preparedStatement = connection.prepareStatement(
                        "INSERT INTO users (full_name, phone_number, email, user_name, password)" +
                                " VALUES (?, ?, ?, ?, ?);");
                preparedStatement.setString(1, user.getFullName());
                preparedStatement.setString(2, user.getPhoneNumber());
                preparedStatement.setString(3, user.getEmail());
                preparedStatement.setString(4, user.getUserName());
                preparedStatement.setString(5, user.getPassword());
                System.out.println(preparedStatement);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteUserById(int userId) {
        Connection connection = JDBCConnection.getConnection();
        if (connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(
                        "DELETE FROM users WHERE user_id = ?;");
                System.out.println(preparedStatement);
                preparedStatement.setInt(1, userId);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

//    @Override
//    public User getUserById(int userId) {
//        User user = new User();
//        Connection connection = JDBCConnection.getConnection();
//        if (connection != null) {
//            PreparedStatement preparedStatement = null;
//            try {
//                preparedStatement = connection.prepareStatement("select * from users");
//                ResultSet resultSet = preparedStatement.executeQuery();
//                while (resultSet.next()) {
//                    int userId = resultSet.getInt("user_id");
//                    String fullName = resultSet.getString("full_name");
//                    String phoneNumber = resultSet.getString("phone_number");
//                    String email = resultSet.getString("email");
//                    String userName = resultSet.getString("user_name");
//                    String password = resultSet.getString("password");
//                    users.add(new User(userId, fullName, phoneNumber, email, userName, password));
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        return users;
//    }
}
