import java.util.Scanner;
public class l2_8 {
    public static int add(int a, int b){
        int temp = 0x00;
        while(a != 0x00){
            temp = (a & b);
            a = a ^ b;
            b = (temp << 1);
        }
        return a;

    }
    public static int multipl(int a, int b){
        int res = 0;
        while(b != 0){
            if((b & 1) == 1){
                res = add(res, a);
            }
            a <<= 1;
            b >>= 1;
        }
        return res;
    }
    static float divide(float a, float b)
    {
        float sign = ((a < 0) ^ (b < 0)) ? -1 : 1;
        a = Math.abs(a);
        b = Math.abs(b);
        float quotient = 0;
        while (a >= b) {
            a -= b;
            ++quotient;
        }
        if (sign == -1)
            quotient = -quotient;
        return quotient;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Num1: ");
        int num1 = scan.nextInt();

        System.out.print("Num2: ");
        int num2 = scan.nextInt();

        System.out.println(multipl(num1, num2));
        System.out.println(divide(num1, num2));
    }
}
