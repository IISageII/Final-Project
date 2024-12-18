package edu.monmouth.test;

import edu.monmouth.library.*;

public class TestLibrary {

    public static void main(String[] args) {
        // Create a Library instance
        Library library = new Library();

        try {
            // Try to add a valid book
            Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99);
            library.addBook(book1);
            System.out.println("Book added successfully: ");
            System.out.println(book1.getDetails());
            System.out.println();
            
            // Try to add a null book (should throw exception)
            System.out.println("Attempting to add a null book:");
            library.addBook(null); // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Try listing books when the library is empty (before adding any books)
        System.out.println("Attempting to list books in an empty library:");
        Library emptyLibrary = new Library();  // Create a new empty library
        try {
            emptyLibrary.listBooks();  // Should throw exception
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Add more books and list them
            Book book2 = new Book("1984", "George Orwell", 12.99);
            library.addBook(book2);
            Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 10.99);
            library.addBook(book3);

            System.out.println("Books in the updated library:");
            library.listBooks();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Total number of books
        System.out.println("Total books in library: " + library.getTotalBooks());
    }
}

