package com.uptc.edu.ms.vehciles.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uptc.edu.ms.vehciles.model.request.CreateVehicleRequest;
import com.uptc.edu.ms.vehciles.model.response.CreateVehicleResponse;
import com.uptc.edu.ms.vehciles.service.VehiclesService;

@RestController
@RequestMapping("/v1/vehicles")
public class VehiclesController {

	@Autowired
	VehiclesService service;
	
	@PostMapping(value = "")
	public ResponseEntity<CreateVehicleResponse> createVehicle(@RequestBody CreateVehicleRequest body) throws IOException {
		CreateVehicleResponse reponse = new CreateVehicleResponse();
		reponse.setData(service.createVehicle(body));
		return new ResponseEntity<>(reponse, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "")
	public void getAllVehicles() {
		
	}
	
	@GetMapping(value = "/asdasd")
	public void getVehicleById() {
		
	}
	
	@PutMapping(value = "")
	public void updateVehicleById() {
		
	}
	
	@PostMapping(value = "/categories")
	public void createVehicleCategory() {
		
	}
}