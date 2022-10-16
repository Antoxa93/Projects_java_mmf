public class l2_1 {
    public static void main(String[] args){
        final int a = 0x12345;
        int b = 0x11111;

        int x1 = a & b;
        int x2 = a | b;
        int x3 = a ^ b;

        System.out.printf("x1=%d, x2=%d, x3=%d \n", x1, x2, x3);
        System.out.printf("x1=%o, x2=%o, x3=%o \n", x1 ,x2, x3);
        System.out.printf("x1=%x, x2=%x, x3=%x \n", x1, x2, x3);

        System.out.println("\nBin x1 = " + Integer.toBinaryString(x1));
        System.out.println("Bin x2 = " + Integer.toBinaryString(x2));
        System.out.println("Bin x3 = " + Integer.toBinaryString(x3));

        int x = -7;
        int y1 = x<<4;
        int y2 = x>>4;
        int y3 = x>>>4;

        System.out.println("\nBin y1 = " + Integer.toBinaryString(y1));
        System.out.println("Bin y2 = " + Integer.toBinaryString(y2));
        System.out.println("Bin y3 = " + Integer.toBinaryString(y3));
    }
}

