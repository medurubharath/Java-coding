import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int[] copy = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            copy[i] = numbers[i];
        }

        System.out.println("Copied array: " + Arrays.toString(copy));
    }
}
