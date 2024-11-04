<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: tuan
  Date: 10/25/2024
  Time: 11:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
    <%!
        // Khởi tạo từ điển
        Map<String, String> dic = new HashMap<>();
    %>

    <%
        // Thêm từ vào từ điển
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");

        // Lấy từ cần tìm từ request
        String search = request.getParameter("search");
        String result = dic.get(search);

        // Kiểm tra và in kết quả
        if (result != null) {
    %>
    <!-- Hiển thị từ và kết quả trong thẻ <p> -->
    <p>Word: <%= search %></p>
    <p>Result: <%= result %></p>
    <%
    } else {
    %>
    <!-- Hiển thị khi từ không được tìm thấy -->
    <p>Not found</p>
    <%
        }
    %>
</body>
</html>
