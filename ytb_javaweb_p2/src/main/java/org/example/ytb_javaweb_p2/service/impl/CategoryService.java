package org.example.ytb_javaweb_p2.service.impl;

import org.example.ytb_javaweb_p2.dao.ICategoryDAO;
import org.example.ytb_javaweb_p2.dao.impl.CategoryDAO;
import org.example.ytb_javaweb_p2.model.CategoryModel;
import org.example.ytb_javaweb_p2.service.ICategoryService;

import java.util.List;

public class CategoryService implements ICategoryService {
    ICategoryDAO categoryDAO = new CategoryDAO();
    @Override
    public List<CategoryModel> findAll() {
        return categoryDAO.findAll();
    }
}
