package com.company.streams;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();
        System.out.println("\n.........................................................................");
//        System.out.println(books);
        books.stream().filter(book ->book.getAuthor().startsWith("a")).filter(book -> book.getTitle().startsWith("S")).forEach(System.out::println);
//use parallel stream to improve performance NB:this applies to large set of Data Set
//        books.parallelStream().filter(book ->book.getAuthor().startsWith("a")).filter(book -> book.getTitle().startsWith("S")).forEach(System.out::println);
    }
    static ArrayList<Book> populateLibrary(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("arnoldkk","NoFap"));
        books.add(new Book("suna","How to Read"));
        books.add(new Book("arnoldkk","Semen Retation"));
        books.add(new Book("Paul","Holy Bible"));
        books.add(new Book("arnold Kalema","Only the Paranoid Survive"));
        books.add(new Book("Chalse Dickens","Great Expectations"));
        books.add(new Book("Museveni","Bazukula"));
        books.add(new Book("suna","ChapChap"));
        return  books;
    }
}
