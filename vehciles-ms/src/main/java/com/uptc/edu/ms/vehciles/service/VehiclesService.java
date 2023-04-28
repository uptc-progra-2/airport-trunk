package com.uptc.edu.ms.vehciles.service;

import java.io.IOException;

import com.uptc.edu.ms.vehciles.model.Vehicle;
import com.uptc.edu.ms.vehciles.model.request.CreateVehicleRequest;

public interface VehiclesService {
	Vehicle createVehicle(CreateVehicleRequest vehicle) throws IOException;
}
