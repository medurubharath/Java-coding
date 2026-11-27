public class MatrixAddition {
    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{6, 5, 4}, {3, 2, 1}};

        System.out.println("Matrix sum:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }
}