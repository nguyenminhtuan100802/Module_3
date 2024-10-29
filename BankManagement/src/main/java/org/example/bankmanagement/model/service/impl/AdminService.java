package org.example.bankmanagement.model.service.impl;

import org.example.bankmanagement.model.dao.IAdminDAO;
import org.example.bankmanagement.model.dao.impl.AdminDAO;
import org.example.bankmanagement.model.entity.Admin;
import org.example.bankmanagement.model.service.IAdminService;

public class AdminService implements IAdminService {
    private IAdminDAO adminDAO = new AdminDAO();
    @Override
    public Admin getAdminAccount() {
        return adminDAO.getAdminAccount();
    }
}
