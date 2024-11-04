package org.example.ytb_javaweb_p2.service.impl;

import org.example.ytb_javaweb_p2.dao.INewDAO;
import org.example.ytb_javaweb_p2.dao.impl.NewDAO;
import org.example.ytb_javaweb_p2.model.NewModel;
import org.example.ytb_javaweb_p2.service.INewService;

import java.util.List;

public class NewService implements INewService {
    INewDAO newDAO = new NewDAO();
    @Override
    public List<NewModel> findByCategoryId(Long categoryId) {
        return newDAO.findByCategoryId(categoryId);
    }
}
