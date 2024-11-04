package org.example.calculatorapplication;

public class Calculator {
    public static double calculate(double number1, double number2, String operator) throws ArithmeticException {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return number1 / number2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
