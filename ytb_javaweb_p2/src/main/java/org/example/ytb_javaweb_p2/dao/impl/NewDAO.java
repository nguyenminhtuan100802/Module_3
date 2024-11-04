package org.example.ytb_javaweb_p2.dao.impl;

import org.example.ytb_javaweb_p2.dao.INewDAO;
import org.example.ytb_javaweb_p2.model.CategoryModel;
import org.example.ytb_javaweb_p2.model.NewModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NewDAO implements INewDAO {
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java_web";
            String username = "root";
            String password = "minhtuan123";
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }
    @Override
    public List<NewModel> findByCategoryId(Long categoryId) {
        List<NewModel> newModels = new ArrayList<>();
        String sql = "select * from news where category_id = ?";
        // open connection
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1, categoryId);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    NewModel newModel = new NewModel();
                    newModel.setId(resultSet.getLong("id"));
                    newModel.setTitle(resultSet.getString("title"));
                    newModels.add(newModel);
                }
                return newModels;
            } catch (SQLException e) {
                return null;
            }
            finally {
                try{
                    if (connection != null) {
                        connection.close();
                    }
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (resultSet != null) {
                        resultSet.close();
                    }
                } catch (SQLException e) {
                    return null;
                }
            }
        }
        return null;
    }
}
