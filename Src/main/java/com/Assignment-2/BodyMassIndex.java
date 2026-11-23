import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        double weightPounds = scanner.nextDouble();
        System.out.print("Input height in inches: ");
        double heightInches = scanner.nextDouble();
        if (weightPounds <= 0 || heightInches <= 0) {
            System.out.println("Weight and height must be greater than zero.");
            return;
        }
        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;
        double bmi = weightKg / (heightMeters * heightMeters);
        System.out.println("Body Mass Index is " + bmi);
    }
}