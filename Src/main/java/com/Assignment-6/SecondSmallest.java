import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 4, 9, 2};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                int secondSmallest = numbers[i + 1];
                System.out.println("Second smallest number: " + secondSmallest);
                return;
            }
        }
        System.out.println("Second smallest number: " + numbers[1]);
   }
}
