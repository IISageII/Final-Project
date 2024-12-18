package edu.monmouth.test;

import edu.monmouth.interfaces.Employee;
import edu.monmouth.interfaces.InvalidEmployeeInputException;

public class TestEmployee {

    public static void main(String[] args) {
        // Test 1: Default constructor
        Employee employee1 = new Employee();
        System.out.println("Test 1: Default constructor");
        System.out.println(employee1);

        // Test 2: Valid inputs with input validation
        try {
            Employee employee2 = new Employee("40", "20.5");
            System.out.println("Test 2: Employee with valid inputs");
            System.out.println(employee2);
        } catch (InvalidEmployeeInputException e) {
            System.out.println("Error in Test 2: " + e.getMessage());
        }

        // Test 3: Invalid hoursWorked (negative value)
        try {
            Employee employee3 = new Employee("-10", "20.5");
            System.out.println("Test 3: Employee with invalid hoursWorked");
            System.out.println(employee3);
        } catch (InvalidEmployeeInputException e) {
            System.out.println("Error in Test 3: " + e.getMessage());
        }

        // Test 4: Invalid hourlyRate (negative value)
        try {
            Employee employee4 = new Employee("40", "-5");
            System.out.println("Test 4: Employee with invalid hourlyRate");
            System.out.println(employee4);
        } catch (InvalidEmployeeInputException e) {
            System.out.println("Error in Test 4: " + e.getMessage());
        }

        // Test 5: Invalid String input for both hoursWorked and hourlyRate
        try {
            Employee employee5 = new Employee("invalid", "data");
            System.out.println("Test 5: Employee with invalid String input");
            System.out.println(employee5);
        } catch (InvalidEmployeeInputException e) {
            System.out.println("Error in Test 5: " + e.getMessage());
        }
    }
}
