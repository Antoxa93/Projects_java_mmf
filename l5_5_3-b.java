import java.io.*;

public class k5_5_3b {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String separator = File.separator;

        FileReader fr = new FileReader(separator + "D:" + separator + "java"
                + separator + "cw11" + separator + "src" + separator + "test1");
        BufferedReader br = new BufferedReader(fr);
        String line;
        boolean noone = true   ;
        while((line = br.readLine()) != null) {
            if(line.length() > 60){
                System.out.println(line);
                noone = false;
            }
        }
        if (noone){
            System.out.println("There is no one string with more than 60 symbols");
        }
        fr.close();
    }
}