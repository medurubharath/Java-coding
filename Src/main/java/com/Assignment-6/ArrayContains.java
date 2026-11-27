public class ArrayContains {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int target = 30;
        boolean found = false;

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }

        System.out.println("Contains " + target + ": " + found);
    }
}
