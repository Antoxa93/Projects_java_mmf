import java.util.Scanner;

public class l2_3 {

    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть через пробіл цілі числа a та b: ");
        a = input.nextInt();
        b = input.nextInt();

        Double sr_geom = Math.sqrt(a * b);

        System.out.printf("Середнє геометричне: %f\n", sr_geom);
        System.out.printf("Середнє геометричне: %e", sr_geom);
    }
}
