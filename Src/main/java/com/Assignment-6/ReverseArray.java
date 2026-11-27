import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length / 2; i++) {
            int opposite = numbers.length - 1 - i;
            int first = numbers[i];
            numbers[i] = numbers[opposite];
            numbers[opposite] = first;
        }

        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }
}
