public class dz5_3_20 {
    static void out_number(int... a) {
        System.out.println("Кількість аргументів " + a.length);

        if (a.length == 0) System.out.print("0 аргументів");
        else System.out.print("Всі : ");
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        out_number(1, 2, 3, 4, 5, 6, 7);
        out_number(-1, -27, -35, -19898);
        out_number();
    }
}
