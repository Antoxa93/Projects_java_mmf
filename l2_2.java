import java.util.Scanner;

public class l2_2 {

    public static void main(String[] args) {
        int a = 0, b = 0, counter_a = 0, counter_b = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Введіть ціле число a: ");
        a = input.nextInt();
        System.out.print("Введіть ціле число b: ");
        b = input.nextInt();

        Double sr_garm = 2.0 / (1.0 / a + 1.0 / b);

        //String
        String a_st = Integer.toString(a);
        counter_a = a_st.length();

        // Logarithm
        counter_b = (int) (Math.log10(b) + 1);
        /**
         while (true) {
            b = b / 10;
            counter_b++;
            if (b == 0){
                break;
                }
            }*/

        System.out.printf("Розряди a та b відповідно: %d, %d \n", counter_a, counter_b);
        System.out.printf("середнє гармонічне: %.2f", sr_garm);
    }
}
