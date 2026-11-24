import java.util.Scanner;

public class MaximumSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int a = scanner.nextInt();
        System.out.print("Input second number: ");
        int b = scanner.nextInt();

        int result = 0;
        if (a > b) {
            result = 1;
        } else if (b > a) {
            result = 2;
        }

        switch (result) {
            case 1:
                System.out.println("Maximum: " + a);
                break;
            case 2:
                System.out.println("Maximum: " + b);
                break;
            default:
                System.out.println("Both numbers are equal");
        }
    }
}
