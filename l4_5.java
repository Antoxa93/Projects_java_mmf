import java.util.Scanner;

public class l4_5 {
    public static void main(String[] args) {
        int n = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int count = 0;

        for(int i = 1; i < 1001; ++i){
            if(count == n){
                count = 0;
                System.out.println();
            }
            System.out.printf("%3d ", i);
            count++;
        }
    }
}


