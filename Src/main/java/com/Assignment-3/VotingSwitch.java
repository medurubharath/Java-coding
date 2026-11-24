import java.util.Scanner;

public class VotingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input age: ");
        int age = scanner.nextInt();
        int eligible = 0;

        if (age < 0) {
            eligible = -1;
        } else if (age >= 18) {
            eligible = 1;
        }

        switch (eligible) {
            case 1:
                System.out.println("Eligible to vote");
                break;
            case 0:
                System.out.println("Not eligible to vote");
                break;
            default:
                System.out.println("Invalid age");
        }
    }
}
