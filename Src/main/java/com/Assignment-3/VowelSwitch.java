import java.util.Scanner;

public class VowelSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = scanner.nextLine();

        if (input.length() != 1) {
            System.out.println("Error: Enter a single alphabet");
        } else {
            char ch = Character.toLowerCase(input.charAt(0));
            if (ch >= 'a' && ch <= 'z') {
                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println("Vowel");
                        break;
                    default:
                        System.out.println("Consonant");
                }
            } else {
                System.out.println("Error: Enter a valid alphabet");
            }
        }
    }
}
