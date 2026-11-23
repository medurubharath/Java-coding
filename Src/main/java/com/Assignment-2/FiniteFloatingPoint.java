import java.util.Scanner;

public class FiniteFloatingPoint {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double number = scanner.nextDouble();

        if (Double.isFinite(number)) {
            System.out.println("The number is finite.");
        } else {
            System.out.println("The number is not finite.");
        }
    }
}
