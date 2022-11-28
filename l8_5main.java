import com.library.Book;
import com.library.catalog;
import com.library.chtivo;
import com.library.scientific;
import com.library.reader;
import com.library.enumbooks;



import java.util.LinkedList;


public class l8_5main {

    public static void main(String[] args) {

        LinkedList<Book> books= new LinkedList<Book>();
        books.add(new chtivo("1984","Orwell"));
        books.add(new scientific("Matan","Dorogovtsev"));
        books.add(new scientific("Linal","Faddeev"));
        books.add(new scientific("AnGeom","Kirichenko"));
        books.add(new scientific("Big Soviet Encyclopedia","smbd"));


        catalog catalog = new catalog (books);
        reader r1 = new reader("kakoj-to chel",1234);


        catalog.orderBook(r1, enumbooks.SCIENTIFIC, "Matan","Dorogovtsev");


        catalog.seeHistory();


    }

}
