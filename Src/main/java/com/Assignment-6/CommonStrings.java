public class CommonStrings {
    public static void main(String[] args) {

        String[] a = {"Rama", "Krishna", "Sita", "Rama"};
        String[] b = {"Sita", "Rama", "Arjun"};

        for (int i = 0; i < a.length; i++) {

            int k;

            for (k = 0; k < i; k++) {
                if (a[i].equals(a[k])) {
                    break;
                }
            }

            if (k != i) {
                continue;
            }

            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}