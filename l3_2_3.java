import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class l3_2_3 {

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


    public static void MaxAmountNumb(int[][] matr) {
        int[] matr_array = new int[matr.length * matr.length];   //convert to one dimensional array
        int c = 0;
        for(int[]i: matr){
            for(int j: i){
                matr_array[c++] = j;
            }
        }

        int count_increase = 0;
        int max = 0;
        int index_last_increase_el = 0;

        int count_decrease = 0;
        int min = 0;
        int index_last_decrease_el = 0;

        for (int q = 0; q < matr_array.length-1; q++){
            if(matr_array[q+1] > matr_array[q]){
                count_increase += 1;
                if(count_increase > max) {
                    max = count_increase;
                    index_last_increase_el = q + 1;}

            }else {count_increase = 0;}

            if(matr_array[q] > matr_array[q+1]){
                count_decrease += 1;
                if(count_decrease > min) {
                    min = count_decrease;
                    index_last_decrease_el = q + 1;
                }
            } else{count_decrease = 0;}
        }


        System.out.println("maximum sequence of increasing numbers:");
        int[] max_sqnc = new int[max+1];
        System.arraycopy(matr_array,(index_last_increase_el - max),max_sqnc,0,(max + 1));
        System.out.println(Arrays.toString(max_sqnc)+"\namount: "+(max+1));

        System.out.println("\n maximum sequence of decreasing numbers:");
        int[] min_sqnc = new int[min+1];
        System.arraycopy(matr_array,(index_last_decrease_el - min),min_sqnc,0,(min + 1));
        System.out.println(Arrays.toString(min_sqnc)+"\namount: "+(min + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter matrix size: ");
        int size = sc.nextInt();

        int arr[][] = new int[size][size];
        fillRandomMatrix(arr, size);
        printMatrix(arr);

        System.out.println();
        MaxAmountNumb(arr);
    }
}

