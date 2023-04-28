package com.uptc.edu.ms.vehciles.model.request;

public class CreateVehicleRequest {
	private String brand;
	private String model;
	private String year;
	
	
	public CreateVehicleRequest() {
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "CreateVehicleRequest [brand=" + brand + ", model=" + model + ", year=" + year + "]";
	}
}
