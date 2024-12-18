package edu.monmouth.interfaces;

public class Employee implements Payable {

    private double hoursWorked;
    private double hourlyRate;

    // Default constructor
    public Employee() {
        this.hoursWorked = EmployeeConstants.UNKNOWN_HOURS_WORKED;
        this.hourlyRate = EmployeeConstants.UNKNOWN_HOURLY_RATE;
    }

    // Constructor with validation and exception handling for string input
    public Employee(String hoursWorkedStr, String hourlyRateStr) throws InvalidEmployeeInputException {
        try {
            double hoursWorked = Double.parseDouble(hoursWorkedStr);
            double hourlyRate = Double.parseDouble(hourlyRateStr);
            setHoursWorked(hoursWorked);
            setHourlyRate(hourlyRate);          
        } catch (NumberFormatException e) {
            throw new InvalidEmployeeInputException("Invalid input: Please enter valid numeric values.");
        }
    }

    // Setter for hoursWorked with exception handling
    public void setHoursWorked(double hoursWorked) throws InvalidEmployeeInputException {
        if (hoursWorked < 0) {
            throw new InvalidEmployeeInputException("Hours worked cannot be negative.");
        }
        this.hoursWorked = hoursWorked;
    }

    // Getter for hoursWorked
    public double getHoursWorked() {
        return hoursWorked;
    }

    // Setter for hourlyRate with exception handling
    public void setHourlyRate(double hourlyRate) throws InvalidEmployeeInputException {
        if (hourlyRate <= 0) {
            throw new InvalidEmployeeInputException("Hourly rate must be greater than zero.");
        }
        this.hourlyRate = hourlyRate;
    }

    // Getter for hourlyRate
    public double getHourlyRate() {
        return hourlyRate;
    }

    // Method to calculate payment
    @Override
    public double calculatePayment() {
        if (hoursWorked == EmployeeConstants.UNKNOWN_HOURS_WORKED || hourlyRate == EmployeeConstants.UNKNOWN_HOURLY_RATE) {
            return 0.00;
        }
        return hoursWorked * hourlyRate;
    }

    // toString method for employee details
    @Override
    public String toString() {
        return "Hours Worked: " + hoursWorked +
                "\nHourly Rate: " + hourlyRate +
                "\nCalculated Payment: $" + String.format("%.2f", calculatePayment()) + "\n";
    }
}
