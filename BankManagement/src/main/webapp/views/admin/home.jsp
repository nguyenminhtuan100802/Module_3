<%--
  Created by IntelliJ IDEA.
  User: tuan
  Date: 10/29/2024
  Time: 10:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Xin chào Admin</h1>
<a href="${pageContext.request.contextPath}/home?action=add-user">Thêm người dùng</a><br>
<a href="${pageContext.request.contextPath}/home?action=find-user">Tìm kiếm người dùng</a><br>
<a href="${pageContext.request.contextPath}/home?action=edit-user">Chỉnh sửa thông tin người dùng</a><br>
<a href="${pageContext.request.contextPath}/home?action=delete-user">Xóa người dùng</a><br>
<a href="${pageContext.request.contextPath}/home?action=show-all-user">Hiển thị toàn bộ người dùng</a><br>
<a href="${pageContext.request.contextPath}/home?action=exit">Đăng xuất</a><br>
</body>
</html>
