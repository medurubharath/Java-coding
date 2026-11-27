public class DuplicateIntegers {
    public static void main(String[] args) {

        int[] arr = {4, 2, 4, 5, 2, 4};

        for (int i = 0; i < arr.length; i++) {

            int j;

            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }

            if (i != j) {
                continue;
            }

            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}