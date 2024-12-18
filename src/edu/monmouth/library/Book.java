package edu.monmouth.library;

public class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Constructor to initialize title, author, and price
    public Book(String title, String author, double price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title with validation
    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author with validation
    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            throw new IllegalArgumentException("Author cannot be null or empty.");
        }
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price with validation and exception handling for invalid input
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be a positive value.");
        }
    }

    // Method to return book details as a formatted string
    public String getDetails() {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: $" + String.format("%.2f", price);
    }

    // Method to apply a discount to the price
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price -= (price * percentage / 100);
        } else {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100.");
        }
    }
}
