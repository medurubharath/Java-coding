import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {
        int[] numbers = {23, 3, 5, 2, 4};
        String[] names = {"Rama", "Krishna"};

        Arrays.sort(numbers);
        Arrays.sort(names);

        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
        System.out.println("Sorted names: " + Arrays.toString(names));
    }
}
