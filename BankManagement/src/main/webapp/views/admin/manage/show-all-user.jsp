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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>

</head>
<body>
<a href="${pageContext.request.contextPath}/login">Trang chủ</a>
<h1>Danh sách người dùng</h1>
<table class="table table-hover">
    <tr>
        <th>ID</th>
        <th>Họ Tên</th>
        <th>Số Điện Thoại</th>
        <th>Email</th>
        <th>Tài Khoản</th>
        <th>Mật Khẩu</th>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.userId}</td>
            <td>${user.fullName}</td>
            <td>${user.phoneNumber}</td>
            <td>${user.email}</td>
            <td>${user.userName}</td>
            <td>${user.password}</td>
            <td><a href="${pageContext.request.contextPath}/users?action=edit-user&id=${user.userId}">Chỉnh sửa</a></td>
            <td><a href="javascript:void(0);" onclick="confirmDelete(${user.userId});">Xóa</a></td>
        </tr>
    </c:forEach>
</table>

<script type="text/javascript">
    // Hàm xác nhận xóa
    function confirmDelete(userId) {
        if (confirm("Bạn có chắc chắn muốn xóa người dùng này không?")) {
            // Chuyển hướng đến URL xóa người dùng nếu được xác nhận
            window.location.href = `${pageContext.request.contextPath}/home?action=delete-user&id=` + userId;
        }
    }
</script>
</body>
</html>
