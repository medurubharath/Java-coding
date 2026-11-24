import java.util.Scanner;

public class MenuSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int a = scanner.nextInt();
        System.out.print("Input second integer: ");
        int b = scanner.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition: " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication: " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Division: " + ((double) a / b));
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
