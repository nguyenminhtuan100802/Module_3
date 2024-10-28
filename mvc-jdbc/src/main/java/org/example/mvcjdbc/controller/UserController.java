package org.example.mvcjdbc.controller;

import org.example.mvcjdbc.model.User;
import org.example.mvcjdbc.service.IUserService;
import org.example.mvcjdbc.service.impl.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = {"/users"})
public class UserController extends HttpServlet {
    private IUserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String action = req.getParameter("action");
//        if (action == null) {
//            action = "";
//        }
//        switch (action) {
//            case "create":
//                break;
//            case "edit":
//                break;
//            case "delete":
//                break;
//            default:
//                listUser(req, resp);
//
//        }
        List<User> users = userService.getAllUser();
        request.setAttribute("users", users);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/user.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        listUser(req, resp);
    }

    private void listUser(HttpServletRequest req, HttpServletResponse resp) {


    }
}
