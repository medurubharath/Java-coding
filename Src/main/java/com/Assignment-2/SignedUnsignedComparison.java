import java.util.Scanner;

public class SignedUnsignedComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Signed comparison: " + Integer.compare(a, b));
        System.out.println("Unsigned comparison: " + Integer.compareUnsigned(a, b));
    }
}

/*
Result	 Meaning
-1	     First number is smaller
 0	     Both numbers are equal
 1	     First number is greater
*/