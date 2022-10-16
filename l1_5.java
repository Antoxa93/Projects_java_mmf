import java.util.Scanner;
public class l1_5 {
    static Scanner sc = new Scanner (System. in);
    public static void main(String[] args) {
        System.out.print("point A\n");
        System.out.print("enter x: ");
        float x = sc.nextFloat();
        System.out.print("enter y: ");
        float y = sc.nextFloat();
        System.out.print("enter z: ");
        float z = sc.nextFloat();

        System.out.print("\nmassive of points x_i, y_i, z_i");
        System.out.print("\nenter the number of points: ");

        int n = sc.nextInt();

        System.out.println();
        float[] xi = new float[n];
        float[] yi = new float[n];
        float[] zi = new float[n];
        float max_distance = 0;
        float min_distance = 1000000000;

        int max_ind = 0;
        int min_ind = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("\npoint %d\n", (i + 1));
            System.out.printf("enter x: ");
            xi[i] = sc.nextFloat();
            System.out.printf("enter y: ");
            yi[i] = sc.nextFloat();
            System.out.printf("enter z: ");
            zi[i] = sc.nextFloat();
        }
        for (int i = 0; i < n; i++) {
            double d_distance = calc_distance(x, y, z, xi[i], yi[i], zi[i]);
            float distance = (float) d_distance;
            if (distance < min_distance) {
                min_distance = distance;
                min_ind = i;
            }
            if (distance > max_distance) {
                max_distance = distance;
                max_ind = i;
            }
        }
        System.out.printf("\nclosest point: (%f, %f, %f)\n", xi[min_ind], yi[min_ind], zi[min_ind]);
        System.out.printf("\nfurther point: (%f, %f, %f)", xi[max_ind], yi[max_ind], zi[max_ind]);
    }
    static double calc_distance(float x1, float y1, float z1, float x2, float y2, float z2) {
        return Math.sqrt((y2 - y1)*(y2 - y1) + (x2 - x1)*(x2 - x1) + (z2 - z1)*(z2 - z1));
    }
}
