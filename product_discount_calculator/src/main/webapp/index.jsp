<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
  <h2>Product Discount Calculator</h2>
  <form action="/display-discount" method="post">
    <input type="text" name="txtProductDescription" placeholder="Enter product description: "/>
    <input type="text" name="txtListPrice" placeholder="Enter list price: "/>
    <input type="text" name="txtDiscountPercent" placeholder="Enter Discount Percent: "/>
    <input type = "submit" id = "submit" value = "Calculate"/>
  </form>
</body>
</html>