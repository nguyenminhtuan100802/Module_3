package org.example.mvcjdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/demo_mvc";
    private static final String jdbcUsername = "root";
    private static final String jdbcPassword = "minhtuan123";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
