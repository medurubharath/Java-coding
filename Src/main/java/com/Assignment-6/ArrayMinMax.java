public class ArrayMinMax {
    public static void main(String[] args) {
        int[] numbers = {23, 3, -5, 2, 4};
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
