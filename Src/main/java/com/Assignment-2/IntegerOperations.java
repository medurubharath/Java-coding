import java.util.Locale;
import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int first = scanner.nextInt();
        System.out.print("Input 2nd integer: ");
        int second = scanner.nextInt();
        long sum = (long) first + second;
        long difference = (long) first - second;
        long product = (long) first * second;
        double average = ((double) first + second) / 2;
        long distance = Math.abs(difference);
        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + difference);
        System.out.println("Product of two integers: " + product);
        System.out.printf(Locale.US, "Average of two integers: %.2f%n", average);
        System.out.println("Distance of two integers: " + distance);
        System.out.println("Max integer: " + Math.max(first, second));
        System.out.println("Min integer: " + Math.min(first, second));
    }
}
