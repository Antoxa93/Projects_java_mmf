import java.util.Scanner;
public class l3_12 {
    public static int biggest(int a, int b, int c, int d) {
        int maximum = (Math.max(Math.max(a, b), Math.max(c, d)));
        return maximum ;
    }
    public static int smallest(int a, int b, int c, int d) {
        int minimum = (Math.min(Math.min(a, b), Math.min(c, d)));
        return minimum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1st rectangle");
        System.out.println("lower left point: ");
        int x1_1 = sc.nextInt();
        int y1_1 = sc.nextInt();
        System.out.println("top right point: ");
        int x1_2 = sc.nextInt();
        int y1_2 = sc.nextInt();
        System.out.println("\n2nd rectangle");
        System.out.println("lower left point: ");
        int x2_1 = sc.nextInt();
        int y2_1 = sc.nextInt();
        System.out.println("top right point: ");
        int x2_2 = sc.nextInt();
        int y2_2 = sc.nextInt();


        int bigger_x = biggest(x1_1, x1_2, x2_1, x2_2);
        int bigger_y = biggest(y1_1, y1_2, y2_1, y2_2);
        int smaller_x = smallest(x1_1, x1_2, x2_1, x2_2);
        int smaller_y = smallest(y1_1, y1_2, y2_1, y2_2);


        System.out.println("\nUnion");
        System.out.println("lower left point: " + smaller_x + "," + smaller_y);
        System.out.println("top right point: " + bigger_x + "," +  bigger_y);
    }
}
