public class dz5_2_14 {

    public static int summ (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int parn (int[][] matrix){
        int res = 0, x_parn = 0, y_parn = 0;

        int[] x_par = new int[matrix.length];
        int[] y_par = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++){
            int tmp = 0;

            for (int j = 0; j < matrix.length; j++){
                tmp += matrix[i][j];
            }
            if (tmp % 2 == 0){
                x_par[i] = 0;
            } else {
                x_par[i] = 1;
            }
        }

        System.out.println("\n");


        for (int i = 0; i < matrix.length; i++){
            System.out.print(x_par[i] + " ");
        }


        for (int i = 0; i < matrix.length; i++){
            int tmp = 0;
            for (int j = 0; j < matrix[i].length; j++){
                tmp += matrix[j][i];
            }
            if (tmp % 2 == 0){
                y_par[i] = 0;
            } else {
                y_par[i] = 1;
            }
        }

        System.out.println("\n");

        for (int i = 0; i < matrix.length; i++){
            System.out.print(y_par[i] + " ");
        }

        System.out.println("\n");

        if (summ (x_par) > 1 || summ (y_par) > 1) {
            System.out.println("Більше однієї помилки.");
        } else if (summ (x_par) == 0 && summ (y_par) == 0){
            System.out.println("Немає помилок.");
        } else if (summ (x_par) == 1 && summ (y_par) == 1){
            for (int i = 0; i < x_par.length; i++){
                if (x_par[i] != 0){
                    x_parn = i + 1;
                }

            }
            for (int i = 0; i < y_par.length; i++){
                if (y_par[i] == 1){
                    y_parn = i + 1;
                }

            }
            System.out.println("\n");
            System.out.println("Одна помилка, біт за координатами (" + x_parn + " ; " + y_parn + ").");
        }

        return res;
    }

    public static void print (int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String args[]){
        int[][] a = new int[][] {{1, 0, 1, 0}, {0, 0, 1, 0}, {1, 1, 1, 1}, {0, 1, 0, 1}};
        print (a);
        parn (a);

    }

}
