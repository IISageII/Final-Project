package edu.monmouth.test;

import edu.monmouth.inheritance.*;

public class TestVehicle {

    public static void main(String[] args) {
        // Test 1: Default constructor
        Vehicle vehicle1 = new Vehicle();
        System.out.println("Test 1: Default Vehicle");
        vehicle1.displayInfo();
        System.out.println(); // Empty line between tests

        // Test 2: Vehicle with valid make and model
        Vehicle vehicle2 = new Vehicle("Toyota", "Corolla");
        System.out.println("Test 2: Valid Vehicle");
        vehicle2.displayInfo();
        System.out.println();

        // Test 3: Vehicle with invalid make (empty string)
        Vehicle vehicle3 = new Vehicle("", "Civic");
        System.out.println("Test 3: Invalid make (empty string)");
        vehicle3.displayInfo();
        System.out.println();

        // Test 4: Default Car object
        Car car1 = new Car();
        System.out.println("Test 4: Default Car");
        car1.displayInfo();
        System.out.println();

        // Test 5: Car with valid make, model, and fuel type
        Car car2 = new Car("Honda", "Accord", "Petrol");
        System.out.println("Test 5: Valid Car");
        car2.displayInfo();
        System.out.println();

        // Test 6: Car with invalid fuel type (empty string)
        Car car3 = new Car("Ford", "Mustang", "");
        System.out.println("Test 6: Invalid fuel type (empty string)");
        car3.displayInfo();
        System.out.println();
    }
}

