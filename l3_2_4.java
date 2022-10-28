public class l3_2_4 {
    static int sum_between_positive(int[][] matr) {
        int sum = 0, temp = 0, sign;
        boolean bool = false;

        for (int[] row: matr) {
            for (int i: row) {
                sign = Integer.signum(i);
                if (sign == -1 && bool)
                    temp += i;

                else if (sign == 1 || sign == 0) {
                    if (bool) {
                        bool = false;
                        break;

                    } else bool = true;
                }
            }
            if (bool) bool = false;
            else sum += temp;
            temp = 0;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {  { -1, 0, -3, 5 }, { -1,  0, 4, -3 }, { 6, -2, -5, 6}, { 3,  2,  0, -3 } };


        System.out.println("сумма : " + sum_between_positive(matrix));
    }
}