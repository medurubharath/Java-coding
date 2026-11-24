import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = scanner.nextInt();

        switch (number % 2) {
            case 0:
                System.out.println("Even number");
                break;
            default:
                System.out.println("Odd number");
        }
    }
}
