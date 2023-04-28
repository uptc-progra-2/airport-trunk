package com.uptc.edu.ms.vehciles.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uptc.edu.ms.vehciles.model.Vehicle;
import com.uptc.edu.ms.vehciles.model.request.CreateVehicleRequest;
import com.uptc.edu.ms.vehciles.service.VehiclesService;
import com.uptc.edu.ms.vehciles.utils.FilesUtils;

@Service
public class VehiclesServiceImpl implements VehiclesService {

	@Autowired
	FilesUtils filesUtils;
	
	@Override
	public Vehicle createVehicle(CreateVehicleRequest vehicle) throws IOException {
		Vehicle newVehicle = new Vehicle();
		newVehicle.setBrand(vehicle.getBrand());
		newVehicle.setModel(vehicle.getModel());
		newVehicle.setYear(vehicle.getYear());
		filesUtils.write("src/main/resources/db/vehicles.txt", newVehicle.toString());
		return newVehicle;
	}

}
