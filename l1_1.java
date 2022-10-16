import java.util.Scanner;

public class l1_1 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        String[] arr = get.nextLine().split(" ");

        for (String str: arr) {
            System.out.println(str);
        }
    }
}