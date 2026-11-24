import java.util.Scanner;

public class NumberType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        String input = scanner.next();
        double number = Double.parseDouble(input);
        System.out.println("Input value: " + input);

        double value = Math.abs(number);

        if (number == 0) {
            System.out.println("Zero");
        } 
        else if (number > 0) {
            if (value < 1) {
                System.out.println("Positive small number");
            } else if (value > 1000000) {
                System.out.println("Positive large number");
            } else {
                System.out.println("Positive number");
            }
        }
        else {
            if (value < 1) {
                System.out.println("Negative small number");
            } else if (value > 1000000) {
                System.out.println("Negative large number");
            } else {
                System.out.println("Negative number");
            }
        }
    }
}
