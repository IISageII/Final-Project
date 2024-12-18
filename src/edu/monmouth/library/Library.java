package edu.monmouth.library;

import java.util.ArrayList;

public class Library {
    // List to store books
    private ArrayList<Book> books;

    // Constructor to initialize the books list
    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Cannot add a null book to the library.\n");
        }
        books.add(book);
    }

    // Method to list all books in the library
    public void listBooks() {
        if (books.isEmpty()) {
            throw new IllegalStateException("No books are available in the library.\n");
        }
        for (Book book : books) {
            System.out.println(book.getDetails());
            System.out.println();
        }
    }

    //Method to get the total number of books
    public int getTotalBooks() {
        return books.size();
    }
}
