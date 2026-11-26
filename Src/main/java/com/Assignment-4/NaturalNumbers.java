import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Read how many natural numbers to display.
            System.out.print("Input the number: ");
            int n = scanner.nextInt();
            long sum = 0;

            System.out.println("The first n natural numbers are:");

            // Print each number from 1 through n and add it to the running sum.
            for (long i = 1; i <= n; i++) {
                System.out.println(i);
                sum += i;
            }

            // Display the final total after the loop finishes.
            System.out.println("The Sum of Natural Numbers upto n terms: " + sum);
        }

    }
}
