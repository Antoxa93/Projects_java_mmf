import java.util.Scanner;

public class l2_4 {
    public static int newbit(int n, int p, int b)
    {
        int mask = 1 << p;
        return (n & ~mask) |
                ((b << p) & mask);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String bit = Integer.toBinaryString(n);

        System.out.println(newbit(n,m, ~Integer.parseInt(String.valueOf(bit.charAt(m)))));

    }
}
