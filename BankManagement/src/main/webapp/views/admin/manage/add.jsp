<%--
  Created by IntelliJ IDEA.
  User: tuan
  Date: 10/29/2024
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add user</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<h2>Thêm người dùng</h2>
<form action="${pageContext.request.contextPath}/home?action=add-user" method="post">
    <label for="fullName"></label><br>
    <input type="text" id="fullName" name="fullName" placeholder="Họ và tên" required><br><br>

    <label for="phoneNumber"></label><br>
    <input type="tel" id="phoneNumber" name="phoneNumber" placeholder="Số điện thoại" required><br><br>

    <label for="email"></label><br>
    <input type="email" id="email" name="email" placeholder="Email" required><br><br>

    <input type="submit" value="Tạo Tài Khoản">
</form>
<!-- Hiển thị thông báo lỗi nếu có -->
<c:if test="${not empty loginError}">
    <p class="error">${loginError}</p>
</c:if>
</body>
</html>
