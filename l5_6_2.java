import java.io.*;
import java.util.*;

public class k5_6_2 {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        Scanner textFile = new Scanner(new File(separator + "D:" + separator + "java"
                + separator + "CW11" + separator + "src" + separator + "test2"));
        FileWriter fw = new FileWriter(separator + "D:" + separator + "java"
                + separator + "CW11" + separator + "src" + separator + "outfile4");

        double product = 1;
        int count = 0;
        System.out.println("All numbers in text file :");
        while (textFile.hasNextInt()) {
            int nextInt = textFile.nextInt();
            count += 1;
            System.out.println(count + ". " +nextInt);
            if (nextInt != 0){
                product *= Math.abs(nextInt);
                fw.write(nextInt + " ");
            }

        }
        System.out.println("\nTheir product = " + product);
        fw.close();
    }
}