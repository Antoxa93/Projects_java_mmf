import java.util.Scanner;

public class l4_6_zh {
    public static void main(String[] args) {
        double x, a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть значення аргументу х : ");
        x = sc.nextDouble();
        System.out.println("Введіть значення параметру а : ");
        a = sc.nextDouble();

        double invsqrt = 1.f/(Math.sqrt(1 - a * x * x));
        double invsqrt_derivative = (a * x)/((Math.sqrt(1 - a * x * x)) * (1 - a * x * x));

        System.out.println("Invsqrt : " + invsqrt + "\nInvsqrt_derivative : " + invsqrt_derivative);


    }
}
