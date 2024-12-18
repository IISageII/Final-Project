package edu.monmouth.interfaces;

// Custom exception class to handle invalid inputs for Employee class
public class InvalidEmployeeInputException extends Exception {

    // Constructor that accepts a message
    public InvalidEmployeeInputException(String message) {
        super(message); // Pass the message to the parent class (Exception)
    }
}
