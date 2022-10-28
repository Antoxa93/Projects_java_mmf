

import java.util.stream.IntStream;

public class l1_22 {

    public int[][] getSpiralMatrix(int n, boolean reverse) {
        int [][] matrix = new int[n][];
        IntStream.range(0, n).forEach(i -> matrix[i] = new int[n]);

        int x = 0;
        int y = 0;
        int z = n;
        for (int i = 0, j = n * n; i < j;) {
            matrix[x][y] = reverse ? j - i++ : ++i;

            if (x < z + (n - z) / 2 - 1 && y == (n - z) / 2) {
                x++;
            } else if (x == z + (n - z) / 2 - 1 && y < z + (n - z) / 2 - 1) {
                y++;
            } else if (x > (n - z) / 2 && y == z + (n - z) / 2 - 1) {
                x--;
            } else if (x == (n - z) / 2 && y > (n - z) / 2 + 1) {
                y--;
            } else {
                x++;
                z -= 2;
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        IntStream.range(0, matrix.length).forEach(i -> {
            IntStream.range(0, matrix.length).forEach(j -> System.out.printf("%02d ", matrix[j][i]));
            System.out.println();
        });
    }

    public static void main(String[] args) {
        l1_22 sp = new l1_22();
        int n = 9;

        int[][] matrix = sp.getSpiralMatrix(n, true);
        printMatrix(matrix);

        System.out.println("===========================");

        matrix = sp.getSpiralMatrix(n, false);
        printMatrix(matrix);
    }


}