public class CommonIntegers {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 20};
        int[] b = {20, 40, 60};

        for (int i = 0; i < a.length; i++) {

            int k;

            for (k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    break;
                }
            }

            if (k != i) {
                continue;
            }

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}