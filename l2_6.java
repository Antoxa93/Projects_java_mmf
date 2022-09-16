
import java.util.Scanner;
import java.util.Random;

public class l2_6 {

    public static void main(String[] args) {
        int N = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть кількість випадкових значень: ");
        N = input.nextInt();

        for (int i = 0; i < N; i++){
            System.out.printf("%f ", Math.random());
        }

        for (int i = 0; i < N; i++){
            System.out.printf("%f\n", Math.random());
        }
    }
}
