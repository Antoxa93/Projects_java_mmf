import java.io.*;

public class k5_5_2a {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String separator = File.separator;
        int empty = 0;

        FileReader fr = new FileReader(separator + "D:" + separator + "java"
                + separator + "cw11" + separator + "src" + separator + "test1");
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) {
                empty++;
            }
        }
        System.out.println("Number of empty lines: " + empty);
        fr.close();
    }
}