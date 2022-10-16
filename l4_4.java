import java.util.Scanner;

public class l4_4 {
    public static void main(String[] args) {
        int n = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int count = 0;

        for(int i = 10; i < 100; ++i){
            if(count == n){
                count = 0;
                System.out.println();
            }
            System.out.printf("%d ", i);
            count++;
        }
    }
}
