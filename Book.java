package com.library;

public abstract class Book{
    String name;
    String genre;
    String author;

    Book(){}
    Book(String name, String genre, String author){
        if (name == ""){
            throw new NullPointerException("Argument (name) is not initialized");
        }
        this.name = name;
        if (genre == ""){
            throw new NullPointerException("Argument (genre) is not initialized");
        }
        this.genre = genre;
        if (author == ""){
            throw new NullPointerException("Argument (author) is not initialized");
        }
        this.author = author;
    }
    public String getName() {
        return "<<" + name + ">>";
    }

    public boolean eqls(Book other) {
        if (other == null || this.name != other.name || this.genre != other.genre || this.author != other.author) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "<<" + name + ">> : (type: " + genre + "\tautor: "+author+")";
    }


}
