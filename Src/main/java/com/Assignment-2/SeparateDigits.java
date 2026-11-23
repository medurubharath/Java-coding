import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        String input = scanner.nextLine().trim();
        if (!input.matches("[0-9]{6}")) {
            System.out.println("Please enter exactly six digits.");
            return;
        }
        System.out.println(String.join(" ", input.split("")));
    }
}
