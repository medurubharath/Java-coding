import java.util.Scanner;

public class AdjacentFloatingPointValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter float value: ");
        float a = sc.nextFloat();

        System.out.print("Enter double value: ");
        double b = sc.nextDouble();

        System.out.println("Float Positive: " + Math.nextUp(a));
        System.out.println("Float Negative: " + Math.nextDown(a));

        System.out.println("Double Positive: " + Math.nextUp(b));
        System.out.println("Double Negative: " + Math.nextDown(b));

    }
}