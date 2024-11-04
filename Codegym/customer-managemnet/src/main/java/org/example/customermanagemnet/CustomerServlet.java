package org.example.customermanagemnet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John Doe", "1990-01-01", "123 Main St", "images/john.jpg"));
        customers.add(new Customer("Jane Smith", "1992-05-15", "456 Maple St", "images/jane.jpg"));
        customers.add(new Customer("Alice Johnson", "1988-09-23", "789 Oak St", "images/alice.jpg"));

        request.setAttribute("customers", customers);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
