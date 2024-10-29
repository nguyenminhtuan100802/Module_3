package org.example.bankmanagement.controller;

import org.example.bankmanagement.model.entity.User;
import org.example.bankmanagement.model.service.IUserService;
import org.example.bankmanagement.model.service.impl.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {
    private IUserService userService = new UserService();
    private RequestDispatcher requestDispatcher;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action) {
            case "add-user":
                requestDispatcher = req.getRequestDispatcher("views/admin/manage/add.jsp");
                requestDispatcher.forward(req, resp);
                break;
            case "find-user":
                break;
            case "edit-user":
                break;
            case "delete-user":
                break;
            case "show-all-user":
                List<User> users = userService.getAllUsers();
                req.setAttribute("users", users);
                requestDispatcher = req.getRequestDispatcher("views/admin/manage/show-all-user.jsp");
                requestDispatcher.forward(req, resp);
                break;
            case "exit":
                requestDispatcher = req.getRequestDispatcher("views/login/login.jsp");
                requestDispatcher.forward(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action) {
            case "add-user":
                boolean isUserExist = false;
                List<User> users = userService.getAllUsers();
                String fullName = req.getParameter("fullName");
                String phoneNumber = req.getParameter("phoneNumber");
                String email = req.getParameter("email");
                if (users.isEmpty()) {
                    userService.addUser(new User(fullName, phoneNumber, email));
                    requestDispatcher = req.getRequestDispatcher("views/admin/manage/add-success.jsp");
                    requestDispatcher.forward(req, resp);
                }
                else {
                    for (User user : users) {
                        if (user.getPhoneNumber().equals(phoneNumber) || user.getEmail().equals(email)) {
                            requestDispatcher = req.getRequestDispatcher("views/admin/manage/add.jsp");
                            requestDispatcher.forward(req, resp);
                        }
                    }
                    if (!isUserExist) {
                        userService.addUser(new User(fullName, phoneNumber, email));
                        requestDispatcher = req.getRequestDispatcher("views/admin/manage/add-success.jsp");
                        requestDispatcher.forward(req, resp);
                    }
                }

                break;

        }
    }
}
