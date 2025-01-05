import static java.lang.Math.*;

public class MathOperations {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 5;

        int sum = add(num1, num2);
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);

        int difference = subtract(num1, num2);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);

        int product = multiply(num1, num2);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);

        try {
            int quotient = divide(num1, num2);
            System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}