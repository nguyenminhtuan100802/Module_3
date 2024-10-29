package org.example.ytb_javaweb_p2.dao.impl;

import org.example.ytb_javaweb_p2.dao.ICategoryDAO;
import org.example.ytb_javaweb_p2.model.CategoryModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO implements ICategoryDAO {
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
    public List<CategoryModel> findAll() {
        List<CategoryModel> categoryModels = new ArrayList<>();
        String sql = "select * from category";
        // open connection
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    CategoryModel categoryModel = new CategoryModel();
                    categoryModel.setId(resultSet.getLong("id"));
                    categoryModel.setName(resultSet.getString("name"));
                    categoryModel.setCode(resultSet.getString("code"));
                    categoryModels.add(categoryModel);
                }
                return categoryModels;
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
