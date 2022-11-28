package com.library;

import java.util.LinkedList;

public class reader{
    String surname;
    int id;
    LinkedList<Book> books;

    public reader(String surname,int id){
        this.surname=surname;
        this.id=id;
        books = new LinkedList<>();
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

    public String getName() {
        return id+" & "+surname;
    }

    @Override
    public String toString() {
        return id+" "+surname+", books: "+books;
    }
}
