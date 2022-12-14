import com.library.*;
import java.io.FileNotFoundException;
import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;


public class glavn_test {

    public static void add_reader(){
        while (true){
            System.out.printf("\nLibrary. To add reader, enter 1, to exit -- enter 0");
            Scanner sc = new Scanner(System.in);
            int res1 = sc.nextInt();
            if (res1 == 0){
                break;
            } else {
                //File file = new File("/Users/mac/Documents/last_dz/src/reader.csv");
                try {
                    FileWriter write = new FileWriter("/Users/mac/Documents/last_dz/src/readers.csv", true);
                    sc = new Scanner(System.in);
                    String line = sc.nextLine();
                    write.write(line + ",");

                    sc = new Scanner(System.in);
                    line = sc.nextLine();
                    write.write(line + "\n");

                    write.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    public static LinkedList<Book> input_books() throws FileNotFoundException {
        LinkedList<Book> books = new LinkedList<Book>();
        //adding scientific books to base
        File file = new File("/Users/mac/Documents/last_dz/src/scientific_books.csv");
        Scanner scanner = new Scanner (file);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String [] values_array = line.split(";");
            books.add(new scientific(values_array[0], values_array[1]));
        }
        //adding fiction books to base
        file = new File("/Users/mac/Documents/last_dz/src/fiction_books.csv");
        scanner = new Scanner (file);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String [] values_array = line.split(";");
            books.add(new chtivo(values_array[0], values_array[1]));
            //System.out.println(values_array[0] + "  \t  " + values_array[1]);
        }

        //adding fiction books to base
        file = new File("/Users/mac/Documents/last_dz/src/encyclopedia_books.csv");
        scanner = new Scanner (file);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String [] values_array = line.split(";");
            books.add(new encyclopedia(values_array[0], values_array[1]));
        }
        return books;
    }


    public static reader[] input_readers(int n) throws FileNotFoundException {
        reader[] readers = new reader[n];
        File file = new File("/Users/mac/Documents/last_dz/src/readers.csv");
        Scanner scanner = new Scanner (file);
        int i = 0;

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String [] values_array = line.split(";");
            readers[i] = new reader(values_array[0], Integer.parseInt(values_array[1]));

            i++;
        }
        return readers;
    }


    public static void main(String[] args) throws FileNotFoundException{
        int number_of_readers = 25;
        LinkedList<Book> books = input_books();


        catalog catalog = new catalog (books);

        reader[] readers = input_readers(number_of_readers);


        catalog.orderBook(readers[0], enumbooks.SCIENTIFIC, "Linal","Faddeev");
        catalog.orderBook(readers[0], enumbooks.FICTION, "1984","Orwell");
        catalog.returnedBook(readers[0], enumbooks.SCIENTIFIC, "Linal","Faddeev");
        catalog.orderBook(readers[1], enumbooks.FICTION, "We","Zamyatin");
        catalog.returnedBook(readers[1], enumbooks.FICTION, "We","Zamyatin");
        catalog.orderBook(readers[0], enumbooks.FICTION, "1984","Orwell");

        /*
        while (true){
            System.out.printf("\nLibrary. To choose genre, enter 1, to exit -- enter 0");
            Scanner sc = new Scanner(System.in);
            int res1 = sc.nextInt();
            if (res1 == 0){
                break;
            } else {
                System.out.printf("Choose 'f' -- fiction; 's' -- scientific; 'e' -- encyclopedia");
                sc = new Scanner(System.in);
                String res2 = sc.nextLine();
                if (res2 == "s"){
                    System.out.printf("\tscientific");
                } else if (res2 == "e") {
                    System.out.printf("\tencyclopedia");
                } else {
                    System.out.printf("\tfiction");
                }
            }
        }

         */







        catalog.seeHistory();



        add_reader();





    }

}
