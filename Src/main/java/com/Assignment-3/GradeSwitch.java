import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input grade: ");
        String grade = scanner.next().toUpperCase();

        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Very Good");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Average");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
