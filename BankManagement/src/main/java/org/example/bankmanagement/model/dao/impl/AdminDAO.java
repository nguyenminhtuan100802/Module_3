package org.example.bankmanagement.model.dao.impl;

import com.mysql.cj.jdbc.JdbcConnection;
import org.example.bankmanagement.model.dao.IAdminDAO;
import org.example.bankmanagement.model.entity.Admin;
import org.example.bankmanagement.model.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAO implements IAdminDAO {

    @Override
    public Admin getAdminAccount() {
        Admin admin = null;
        Connection connection = JDBCConnection.getConnection();
        if (connection != null) {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("select * from admin");
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    admin = new Admin();
                    String username = resultSet.getString("user_name");
                    String password = resultSet.getString("password");
                    admin.setUsername(username);
                    admin.setPassword(password);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return admin;
    }
}
