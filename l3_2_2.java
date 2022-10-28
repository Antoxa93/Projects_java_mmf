import java.util.Objects;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class l3_2_2 {

    static void printMatrix(int[][] matr) {
        for (int[] i: matr) {
            for (int j: i) System.out.print(j + " ");
            System.out.println();
        } System.out.println();
    }

    static void fillRandomMatrix(int matr[][], int d) {
        Random random = new Random();
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                matr[j][i] = random.nextInt(2 * d + 1) - d;
            }
        }
    }


    static int[][] shift(int[][] matr, int k, String direction) {
        int n = matr.length;
        k = k % n;
        int[][] new_matr = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (Objects.equals(direction, "right")) new_matr[i][j] = matr[i][(j + n - k) % n];
                if (Objects.equals(direction, "left"))  new_matr[i][j] = matr[i][(j + k) % n];
                if (Objects.equals(direction, "up"))    new_matr[i][j] = matr[(i + k) % n][j];
                if (Objects.equals(direction, "down"))  new_matr[i][j] = matr[(i + n - k) % n][j];
            }

        return new_matr;
    }
    public static void main(String[] args) {
       /* int[][] matrix = { { 11, 25, 85, 47},
                           { 30, 20, 10, 40 },
                           { 64, 65, 12, 45 },
                           { 14, 83, 55, 34 } };*/

        Scanner sc = new Scanner(System.in);
        System.out.println("N?: ");
        int size = sc.nextInt();

        int matrix[][] = new int[size][size];
        fillRandomMatrix(matrix, size);
        printMatrix(matrix);


        System.out.println("Матриця");
        printMatrix(matrix);

        System.out.println("Сдвинута праворуч");
        printMatrix(shift(matrix, 1, "right"));

        System.out.println("Сдвинута ліворуч");
        printMatrix(shift(matrix, 1, "left"));

        System.out.println("На 1 вверх");
        printMatrix(shift(matrix, 1, "up"));

        System.out.println("на 1 вниз");
        printMatrix(shift(matrix, 1, "down"));
    }
}
