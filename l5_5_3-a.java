import java.io.*;

public class k5_5_3a {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String separator = File.separator;

        FileReader fr = new FileReader(separator + "D:" + separator + "java"
                + separator + "cw11" + separator + "src" + separator + "test1");
        BufferedReader br = new BufferedReader(fr);
        String line;

        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        fr.close();
    }
}