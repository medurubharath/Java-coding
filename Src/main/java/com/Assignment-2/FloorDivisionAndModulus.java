import java.util.Scanner;

public class FloorDivisionAndModulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int a = sc.nextInt();

        System.out.print("Enter divisor: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println("Floor Division: " + Math.floorDiv(a, b));
            System.out.println("Floor Modulus: " + Math.floorMod(a, b));
        }

    }
}