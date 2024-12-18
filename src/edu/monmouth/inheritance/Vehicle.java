package edu.monmouth.inheritance;

public class Vehicle {
	
	private String make;
	private String model;
	
    // Default constructor, initializing with constants for unknown values
	public Vehicle() {
		this.make = VehicleConstants.UNKNOWN_MAKE;
		this.model = VehicleConstants.UNKNOWN_MODEL;
	}
	
    // Constructor to initialize make and model with validation
	public Vehicle (String make, String model) {
		setMake(make);
		setModel(model);
	}
	
	public void setMake(String make) {
		if (make != null && !make.trim().isEmpty()) {
			this.make = make;
		} else {
			this.make = VehicleConstants.UNKNOWN_MAKE;
		}
	}
	
	public String getMake() {
		return make;
	}
	
	public void setModel (String model) {
		if (model != null && !model.trim().isEmpty()) {
			this.model = model;
		} else {
			this.model = VehicleConstants.UNKNOWN_MODEL;
		}
	}
	
	public String getModel() {
		return model;
	}
	
	//Method to display vehicle info
	public void displayInfo() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
	}
	

}
