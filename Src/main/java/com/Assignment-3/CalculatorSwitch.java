import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        double a = scanner.nextDouble();
        System.out.print("Input second number: ");
        double b = scanner.nextDouble();
        System.out.print("Input operator (+, -, *, /): ");
        String operator = scanner.next();

        switch (operator) {
            case "+":
                System.out.println("Result: " + (a + b));
                break;
            case "-":
                System.out.println("Result: " + (a - b));
                break;
            case "*":
                System.out.println("Result: " + (a * b));
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
