import java.util.Random;
import java.util.Scanner;

public class l3_2_1 {

    static void printMatrix(int[][] matr) {
        for (int[] i: matr) {
            for (int j: i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
    static void fillRandomMatrix(int matr[][], int d) {
        Random random = new Random();
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                matr[j][i] = random.nextInt(2 * d + 1) - d;
            }
        }
    }

    static int[][] sort(int[][] matr, int k) {
        int n = matr.length;
        int[][] res = matr.clone();
        k--;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)

                if (res[j][k] > res[j + 1][k]) {
                    int[] temp = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = temp;
                }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("N?: ");
        int size = sc.nextInt();
        int arr[][] = new int[size][size];
        System.out.println("Matrix");


        fillRandomMatrix(arr, size);

        printMatrix(arr);

        System.out.println("\nTransp");
        printMatrix(sort(arr, 4));
    }
}

