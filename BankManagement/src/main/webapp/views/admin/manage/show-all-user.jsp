<%--
  Created by IntelliJ IDEA.
  User: tuan
  Date: 10/29/2024
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>All user</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/login">Trang chủ</a>
<h1>Danh sách người dùng</h1>
<table class="">
  <tr>
    <th>ID</th>
    <th>Họ Tên</th>
    <th>Số Điện Thoại</th>
    <th>Email</th>
  </tr>
  <c:forEach var="user" items="${users}">
    <tr>
      <td>${user.userId}</td>
      <td>${user.fullName}</td>
      <td>${user.phoneNumber}</td>
      <td>${user.email}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
