package org.example.ytb_javaweb_p2.service;

import org.example.ytb_javaweb_p2.model.CategoryModel;

import java.util.List;

public interface ICategoryService {
    List<CategoryModel> findAll();
}
