package org.example.ytb_javaweb_p2.controller.web;

import org.example.ytb_javaweb_p2.model.UserModel;
import org.example.ytb_javaweb_p2.service.ICategoryService;
import org.example.ytb_javaweb_p2.service.impl.CategoryService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet {
    private ICategoryService categoryService = new CategoryService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        UserModel userModel = new UserModel();
//        userModel.setFullName("Minh Tuan");
//        request.setAttribute("userModel", userModel);
        request.setAttribute("categories", categoryService.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/home.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
