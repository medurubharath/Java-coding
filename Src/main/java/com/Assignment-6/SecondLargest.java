import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 4, 9, 2};
        Arrays.sort(numbers);

        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[i] != numbers[i - 1]) {
                int secondLargest = numbers[i - 1];
                System.out.println("Second largest number: " + secondLargest);
                return;
            }
        }

        System.out.println("There is no second largest distinct value.");
    }
}