import java.util.Scanner;

public class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double subtract() {
        return a - b;
    }

    public double multiply() {
        return a * b;
    }

    public double divide() {
        if (b != 0) {
            return a / b;
        } 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the type of operation (+, -, *, /): ");
        String operation = scanner.next();

        Calculator calculator = new Calculator(a, b);
        double result;

        switch (operation) {
            case "+":
                result = calculator.add();
                break;
            case "-":
                result = calculator.subtract();
                break;
            case "*":
                result = calculator.multiply();
                break;
            case "/":
                try {
                    result = calculator.divide();
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
