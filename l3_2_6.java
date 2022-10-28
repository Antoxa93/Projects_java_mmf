import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



public class l3_2_6 {

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


    static void  normal2(int[][]matr) {
        int []sum_row = new int[matr.length];
        for(int i = 0; i < matr.length; i++) {
            for(int j = 0; j < matr[0].length; j++) {
                sum_row[i] += Math.abs(matr[i][j]);
            }
        }
        List<Integer> list = new LinkedList();
        for(int x = 0; x < sum_row.length; x++){
            list.add(sum_row[x]);
        }
        System.out.println("row sum: " + list);
        System.out.println("mormal 1 (max from row sum): " + Collections.max(list));
        System.out.println();
    }

    static void normal1(int[][]matr) {
        int[]sum_col = new int[matr[0].length];
        for(int j = 0; j < matr[0].length; j++) {
            for(int i =0; i < matr.length; i++) {
                sum_col[j] += Math.abs(matr[i][j]);
            }
        }
        List<Integer> list = new LinkedList();
        for(int x = 0; x < sum_col.length; x++){
            list.add(sum_col[x]);
        }
        System.out.println("columb sum: " + list);
        System.out.println("mormal 2 (max from columb sum): " + Collections.max(list));
        System.out.println();

    }
    static void normal3(int[][]matr) {
        int[]sum_col = new int[matr[0].length];
        double normal_3 = 0;
        for(int j = 0; j < matr[0].length; j++) {
            for(int i =0; i < matr.length; i++) {
                normal_3 += Math.pow((matr[i][j]),2);
            }
        }
        System.out.println("mormal 3 (sum of squares of each element): " + normal_3);
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N?: ");
        int size = sc.nextInt();
        int matr[][] = new int[size][size];

        fillRandomMatrix(matr, size);
        printMatrix(matr);

        System.out.println("Норма" );
        normal1(matr);
        normal2(matr);
        normal3(matr);
    }
}