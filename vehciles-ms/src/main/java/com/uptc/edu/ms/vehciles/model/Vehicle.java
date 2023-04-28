package com.uptc.edu.ms.vehciles.model;


public class Vehicle {
	
	private int id;
	private String brand;
	private String model;
	private String year;
		
	public Vehicle() {
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id + ";" + brand + ";" + model + ";" + year;
	}
	

}
