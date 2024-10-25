<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
    <h2>Simple Calculator</h2>
    <form action="/calculate" method="post">
        <label for="number1">Number 1:</label>
        <input type="text" id="number1" name="number1" required><br><br>

        <label for="operator">Operator:</label>
        <select id="operator" name="operator">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select><br><br>

        <label for="number2">Number 2:</label>
        <input type="text" id="number2" name="number2" required><br><br>

        <button type="submit">Calculate</button>
    </form>

    <p>Error: ${error}</p>
</body>
</html>