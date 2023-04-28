package com.uptc.edu.ms.vehciles.model.response;

import com.uptc.edu.ms.vehciles.model.Vehicle;

public class CreateVehicleResponse {
	private Vehicle data;
	
	public CreateVehicleResponse() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle getData() {
		return data;
	}

	public void setData(Vehicle data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "CreateVehicleResponse [data=" + data + "]";
	}
	
	
}
