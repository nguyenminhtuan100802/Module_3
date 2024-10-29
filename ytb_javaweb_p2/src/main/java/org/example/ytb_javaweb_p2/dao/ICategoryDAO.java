package org.example.ytb_javaweb_p2.dao;

import org.example.ytb_javaweb_p2.model.CategoryModel;

import java.util.List;

public interface ICategoryDAO {
    List<CategoryModel> findAll();
}
