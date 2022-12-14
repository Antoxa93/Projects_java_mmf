package com.library;

import java.util.LinkedList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class Date {
    String date;

    Date(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        date = dtf.format(now);
    }

}

public class catalog {

    public class History{
        LinkedList<Object[]> history;//date, Reader, Book, status

        public History(){
            history = new LinkedList<>();
        }

        public void addToHistory(String process, reader reader, Book book) {
            history.add(new Object[4]);
            Date d=new Date();
            history.getLast()[0]=d.date;
            history.getLast()[1]=reader.getName();
            history.getLast()[2]=book.getName();
            history.getLast()[3]=process;
        }


        public String toString() {
            String s = "\nDate\t\t\t\t|\tReader(id : surname)"
                    + "\t|\tName of Book\t\t|\tstatus\n"
                    + "____".repeat(20);
            for(Object[] o:history)
                s+="\n"+o[0]+"\t|\t"+o[1]
                        + "\t\t| \t\t"+o[2]+" \t\t\t|\t "+o[3];
            return s;

        }

    }

    LinkedList<Book> books;
    LinkedList<reader> readers;
    History history;

    public catalog(){
        books = new LinkedList<>();
        readers = new LinkedList<>();
        history = new History();
    }

    public catalog(LinkedList<Book> books){
        this.books=books;
        readers = new LinkedList<>();
        history = new History();
    }

    public catalog(LinkedList<Book> books,LinkedList<reader> readers){
        this.books=books;
        this.readers=readers;
        history = new History();
    }

    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    public boolean removeBook(Book book) {
        for (Book b:books) {
            if (b.equals(book)) {
                books.remove(b);
                return true;
            }
        }
        return false;
    }

    public reader addReader(reader reader) {
        if (!readers.contains(reader))
            readers.add(reader);
        return reader;
    }

    public Book getBook(enumbooks book, String name, String author) {
        Book b = null;
        switch (book){
            case FICTION:
                b = new chtivo(name, author);
                break;
            case ENCYCLOPEDIA:
                b = new encyclopedia(name, author);
                break;
            case SCIENTIFIC:
                b = new scientific(name, author);
                break;
        }
        return b;
    }

    public Book orderBook(reader reader, enumbooks book, String name, String author) {
        Book b = getBook(book, name, author);
        System.out.println("Order\t Reader: "+reader.getName()+" Book: "+b);

        if (!b.equals(null)) {
            if (!removeBook(b)) {
                System.out.println("error");
                //return null;
            }
            readers.remove(reader);
            reader.books.add(b);
            history.addToHistory("takes", reader, b);
        }
        addReader(reader);
        return b;
    }

    public Book returnedBook(reader reader, enumbooks book, String name, String author) {
        Book b = null;
        b = getBook(book, name, author);
        System.out.println("Return\t Reader: "+reader.getName()+" Book: "+b);
        if (!reader.removeBook(b)){
            System.out.println("error");
            //return null;
        }
        if (!b.equals(null)) {
            books.add(b);
            history.addToHistory("returns", reader, b);
        }
        addReader(reader);
        return b;
    }

    public void seeHistory() {
        System.out.println(history);
    }


}
