<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Customer List</title>
    <style>
        table {
            width: 50%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 8px;
            text-align: left;
        }
        img {
            width: 100px;
            height: 100px;
        }
    </style>
</head>
<body>
<h2>Customer List</h2>
<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Date of Birth</th>
        <th>Address</th>
        <th>Photo</th>
    </tr>
    </thead>
    <tbody>
    <!-- Sử dụng JSTL để lặp qua danh sách khách hàng và hiển thị thông tin -->
    <c:forEach var="customer" items="${customers}">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.dob}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.photo}" alt="photo"></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>