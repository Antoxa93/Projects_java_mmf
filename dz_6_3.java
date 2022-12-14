import java.io.*;
import java.util.*;

public class dz_6_3{
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        //using separator for making code crossplatform
        Scanner textFile = new Scanner(new File(separator + "Users" + separator + "mac"
                + separator + "Documents" + separator + "clswrk9" + separator + "src" + separator + "text6_3"));

        FileWriter fw = new FileWriter(separator + "Users" + separator + "mac"
                + separator + "Documents" + separator + "clswrk9" + separator + "src" + separator + "text6_3out");

        double product = 1;
        int count = 0;
        System.out.println("numbers in text file :");

        while (textFile.hasNextInt()) {
            int nextInt = textFile.nextInt();
            count += 1;

            System.out.println(count + ". " +nextInt);
            if (count%2 == 0){
                product *= nextInt;
                fw.write(nextInt + " ");
            }

        }
        System.out.println("\n Proizv par = " + product);
        fw.close();
    }
}
