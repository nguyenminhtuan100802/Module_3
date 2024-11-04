package org.example.calculatorapplication;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Lấy dữ liệu từ form
            double number1 = Double.parseDouble(request.getParameter("number1"));
            double number2 = Double.parseDouble(request.getParameter("number2"));
            String operator = request.getParameter("operator");

            // Gọi phương thức calculate và nhận kết quả
            double result = Calculator.calculate(number1, number2, operator);

            // Chuyển kết quả sang trang kết quả
            request.setAttribute("result", result);
            request.getRequestDispatcher("result.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            // Lỗi nhập liệu không hợp lệ
            request.setAttribute("error", "Invalid input. Please enter valid numbers.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (ArithmeticException e) {
            // Lỗi chia cho 0
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (Exception e) {
            // Lỗi không xác định
            request.setAttribute("error", "An error occurred. Please try again.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
