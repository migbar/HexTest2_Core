package main.core.domain;

public class Vehicle {
	
	private String model = null;
	private String modelYear = null;
	
	public Vehicle(String model, String modelYear) {
		super();
		this.model = model;
		this.modelYear = modelYear;
	}

	public String getModel() {
		return model;
	}

	public String getModelYear() {
		return modelYear;
	}

}
