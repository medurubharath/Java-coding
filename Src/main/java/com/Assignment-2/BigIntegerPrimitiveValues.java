import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerPrimitiveValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a big integer: ");
        BigInteger num = sc.nextBigInteger();

        System.out.println("Byte: " + num.byteValue());
        System.out.println("Short: " + num.shortValue());
        System.out.println("Integer: " + num.intValue());
        System.out.println("Long: " + num.longValue());
        System.out.println("Float: " + num.floatValue());
        System.out.println("Double: " + num.doubleValue());
        System.out.println("Boolean: " + (num.signum() != 0));
        System.out.println("Character: " + (char) num.intValue());

    }
}