<%--
  Created by IntelliJ IDEA.
  User: tuan
  Date: 10/30/2024
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<h2>Chỉnh sửa người dùng</h2>
<form action="${pageContext.request.contextPath}/home" method="post">
  <label for="username"></label>
  <input type="text" id="username" name="username" placeholder="Tên người dùng" value="${}" required>
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
