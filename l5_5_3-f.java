import java.io.*;
import java.util.Scanner;

public class k5_5_3f {
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
                boolean equal = true;
                for (int i = 0; i < line.length(); i++ ){
                    if (line.charAt(0) != line.charAt(i)){
                        equal = false;
                    }

                }
                if (equal){
                    System.out.println(line);
                    count += 1;
                }
            }
        }
        System.out.println("There are " + count + " lines with equals symbols");
        fr.close();
    }
}