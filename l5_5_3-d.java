import java.io.*;
import java.util.Scanner;

public class k5_5_3d {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String separator = File.separator;
        Scanner sc = new Scanner(System.in);

        FileReader fr = new FileReader(separator + "D:" + separator + "java"
                + separator + "cw11" + separator + "src" + separator + "test1");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int count = 0;
        System.out.print("Enter one symbol: " );
        String finish = sc.nextLine();
        System.out.println("Lines, which ends with: " + finish );
        while((line = br.readLine()) != null) {
            if(line.endsWith(finish)){
                System.out.println(line);
                count += 1;
            }
        }
        if(count == 0){
            System.out.println("There are eno one line, which ends with " + finish);
        }
        else {
            System.out.println("There are " + count + " lines, which ends with " + finish);
        }
        fr.close();
    }
}