public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 7, 9};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
    }
}
