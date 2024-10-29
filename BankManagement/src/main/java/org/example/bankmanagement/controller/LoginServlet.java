package org.example.bankmanagement.controller;

import org.example.bankmanagement.model.entity.Admin;
import org.example.bankmanagement.model.service.IAdminService;
import org.example.bankmanagement.model.service.impl.AdminService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private IAdminService adminService = new AdminService();
    private Admin admin = adminService.getAdminAccount();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username.equals(admin.getUsername()) && password.equals(admin.getPassword())) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/admin/home.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/login/login.jsp");
            requestDispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/admin/home.jsp");
        requestDispatcher.forward(req, resp);
    }
}
