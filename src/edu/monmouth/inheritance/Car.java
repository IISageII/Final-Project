package edu.monmouth.inheritance;

public class Car extends Vehicle {

	private String fuelType;
	
    // Default constructor, initializing with constants
	public Car() {
		super();
		this.fuelType = CarConstants.UNKNOWN_FUEL_TYPE;
	}
	
    // Constructor to initialize make, model, and fuelType with validation
	public Car(String make, String model, String fuelType) {
		super(make, model);
		setFuelType(fuelType);
	}
	
	public void setFuelType(String fuelType) {
		if (fuelType != null && !fuelType.trim().isEmpty()) {
			this.fuelType = fuelType;
		} else {
			this.fuelType = CarConstants.UNKNOWN_FUEL_TYPE;
		}
	}
	
	public String getFuelType() {
		return fuelType;
	}
	
    // Overriding the displayInfo() method to include fuelType
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Fuel Type: " + fuelType);
	}
}
