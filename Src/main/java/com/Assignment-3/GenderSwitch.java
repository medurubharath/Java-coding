import java.util.Scanner;

public class GenderSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input gender (M/F): ");
        String gender = scanner.next().toUpperCase();

        switch (gender) {
            case "M":
                System.out.println("Male");
                break;
            case "F":
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid gender");
        }
    }
}
