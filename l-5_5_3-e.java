import java.io.*;
import java.util.Scanner;

public class k5_5_3e {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String separator = File.separator;
        Scanner sc = new Scanner(System.in);

        FileReader fr = new FileReader(separator + "D:" + separator + "java"
                + separator + "cw11" + separator + "src" + separator + "test1");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int count = 0;
        while((line = br.readLine()) != null) {
            if(!line.isEmpty()){
                if(line.charAt(0) == line.charAt(line.length() - 1)){
                    System.out.println(line);
                    count += 1;
                }
            }
        }
        if(count == 0){
            System.out.println("There are no one line, which begin and ends with ");
        }
        else {
            System.out.println("There are " + count + " lines, which begin and ends with the same symbol");
        }
        fr.close();
    }
}