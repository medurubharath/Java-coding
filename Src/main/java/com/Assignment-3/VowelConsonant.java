import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = scanner.nextLine();

        if (input.length() != 1) {
            System.out.println("Error: Enter a single alphabet");
        } else {
            char ch = input.charAt(0);
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                System.out.println("Error: Enter a valid alphabet");
            } else {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Input letter is Vowel");
                } else {
                    System.out.println("Input letter is Consonant");
                }
            }
        }
    }
}
