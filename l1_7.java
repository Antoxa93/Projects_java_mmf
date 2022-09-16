import java.util.Scanner;

public class l1_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input your name: ");
        String name = input.next();
        System.out.print("Input your surname: ");
        String surname = input.next();

        System.out.println("User`s name: " + name + " " + surname);
    }
}
