package org.example.product_discount_calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TranslateServlet", urlPatterns = "/display-discount")
public class DisplayDiscountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("txtProductDescription");
        float price = Float.parseFloat(request.getParameter("txtListPrice"));
        float discount = Float.parseFloat(request.getParameter("txtDiscountPercent"));


        double priceAfterDiscount = price * discount * 0.01;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>You buy: " + productDescription + "</h1>");
        writer.println("<h1>With price: " + price + "</h1>");
        writer.println("<h1>You get discount: " + discount + "%" + "</h1>");
        writer.println("<h1>=> You need to pay: " + (price - priceAfterDiscount) + "</h1>");
        writer.println("</html>");
    }
}
