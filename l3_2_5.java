import java.util.Random;
import java.util.Scanner;

public class l3_2_5 {

    static void printMatrix(int[][] matr) {
        for (int[] i: matr) {
            for (int j: i)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    static void fillRandomMatrix(int matr[][], int size) {
        Random random = new Random();
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                matr[j][i] = random.nextInt(2 * size + 1) - size;
            }
        }
    }

    static void matrixTranspose(int matr[][], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int temp = matr[i][j];
                matr[i][j] = matr[j][i];
                matr[j][i] = temp;
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N?: ");
        int size = sc.nextInt();
        int matr[][] = new int[size][size];

        fillRandomMatrix(matr, size);
        printMatrix(matr);

        System.out.println("\n-транспонована");
        matrixTranspose(matr, size);
        printMatrix(matr);
    }
}

