<%--
  Created by IntelliJ IDEA.
  User: tuan
  Date: 10/29/2024
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Login</title>
    <style>
        .error {
            color: red;
        }
    </style>

<%--    <script src="https://cdn.tailwindcss.com"></script>--%>


</head>
<body>
<h2>Xin chào,</h2>
<form action="${pageContext.request.contextPath}/login" method="post">
    <label for="username"></label>
    <input type="text" id="username" name="username" placeholder="Tên tài khoản" required>
    <br><br>

    <label for="password"></label>
    <input type="password" id="password" name="password" placeholder="Mật khẩu" required>
    <br><br>

    <button type="submit">Đăng Nhập</button>
</form>
<!-- Hiển thị thông báo lỗi nếu có -->
<c:if test="${not empty loginError}">
    <p class="error">${loginError}</p>
</c:if>
</body>
</html>
