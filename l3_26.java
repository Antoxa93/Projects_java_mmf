import java.util.Scanner;

public class l3_26 {
    public static void main(String[] args) {
        double r, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть радіус основи циліндра : ");
        r = sc.nextDouble();
        System.out.println("Введіть висоту циліндра : ");
        h = sc.nextDouble();

        double res = Math.PI * r * r * h;

        System.out.println("Об'єм цидіндру : " + res);
    }
}
