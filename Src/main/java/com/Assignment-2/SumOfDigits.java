import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int number = scanner.nextInt();
        if (number < 0 || number > 1000) {
            System.out.println("Please enter an integer between 0 and 1000.");
            return;
        }
        int remaining = number;
        int sum = 0;
        do {
            sum += remaining % 10;
            remaining /= 10;
        } while (remaining > 0);
        System.out.println("The sum of all digits in " + number + " is " + sum);
    }
}
