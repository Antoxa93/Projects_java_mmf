import java.util.Random;
import java.util.Scanner;

public class l3_2_7 {

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

    static int[][] rotate(int[][]matr) {
        int[][] rotated = new int[matr.length][matr.length];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                rotated[i][j] = matr[j][matr.length - i - 1];
            }
        }
        return rotated;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N?: ");
        int size = sc.nextInt();
        int matr[][] = new int[size][size];

        fillRandomMatrix(matr, size);
        printMatrix(matr);

        System.out.println("\n 90° ");
        printMatrix(rotate(matr));

        System.out.println("\n 180° ");
        printMatrix(rotate(rotate(matr)));

        System.out.println("\n 270°");
        printMatrix(rotate(rotate(rotate(matr))));
    }
}