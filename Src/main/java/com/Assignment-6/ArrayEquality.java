import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] first = {10, 20, 30};
        int[] second = {10, 20, 30};
        int[] third = {30, 20, 10};

        System.out.println("Same order: " + Arrays.equals(first, second));
        System.out.println("Different order: " + Arrays.equals(first, third));
    }
}
