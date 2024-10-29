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
</head>
<body>
<h2>Add User</h2>
<form action="${pageContext.request.contextPath}/home?action=add-user" method="post">
    <label for="fullName">Họ và tên:</label><br>
    <input type="text" id="fullName" name="fullName" required><br><br>

    <label for="phoneNumber">Số điện thoại:</label><br>
    <input type="tel" id="phoneNumber" name="phoneNumber" required><br><br>

    <label for="email">Email:</label><br>
    <input type="email" id="email" name="email" required><br><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>
