public class DashGrid {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            System.out.print("-");
            for (int column = 1; column < 10; column++) {
                System.out.print(" -");
            }
            System.out.println();
        }
    }
}
