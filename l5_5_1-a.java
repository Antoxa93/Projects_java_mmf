import java.util.*;
import java.io.*;
public class k5_5_1a {
    public static void main(String[] args) throws IOException {
        new k5_5_1a().fileWork();
    }

    public String fileWork () throws FileNotFoundException {
        String separator = File.separator;
        int count = 0;
        String infoFile;
        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File(separator + "D:" + separator + "java"
                + separator + "cw11" + separator + "src" + separator + "test1"));


        while (sc.hasNext()) {
            current = sc.next();
            count += 1;
            if (current.length() > longest_word.length()) {
                longest_word = current;
            }
        }
        System.out.println("\nlongest word: " + longest_word + "\n" + "number of words in file: " + count + "\n");
        infoFile = longest_word + count;

        return infoFile;
    }

}