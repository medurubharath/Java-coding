public class DuplicateStrings {
    public static void main(String[] args) {

        String[] names = {"Rama", "Krishna", "Rama", "Sita", "Krishna", "Rama"};

        for (int i = 0; i < names.length; i++) {

            if (names[i] == null) {
                continue;
            }

            boolean duplicate = false;

            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    duplicate = true;
                    names[j] = null;
                }
            }

            if (duplicate) {
                System.out.println(names[i]);
            }
        }
    }
}