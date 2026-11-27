public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {4, 2, 4, 5, 2, 4};

        for (int i = 0; i < arr.length; i++) {

            int j;

            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }

            if (i == j) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}