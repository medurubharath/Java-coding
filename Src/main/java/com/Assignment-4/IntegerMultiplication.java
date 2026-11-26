import java.util.Scanner;
class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number for multiplication: ");
        int num1 = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = num1 * i;
            System.out.println(num1 + " x " + i + " = " + result);
        }
    }
}