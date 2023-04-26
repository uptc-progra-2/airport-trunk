package co.edu.uptc.prgII.msairplane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsAirplaneApplication {

	private int id;
	private int  numberChairs;
	private String model;
	private AirplaneType type;
	private int flightHours;
	private  Status status;
	private int timeInFlight;



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberChairs() {
		return numberChairs;
	}

	public void setNumberChairs(int numberChairs) {
		this.numberChairs = numberChairs;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public AirplaneType getType() {
		return type;
	}

	public void setType(AirplaneType type) {
		this.type = type;
	}

	public int getFlightHours() {
		return flightHours;
	}

	public void setFlightHours(int flightHours) {
		this.flightHours = flightHours;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getTimeInFlight() {
		return timeInFlight;
	}

	public void setTimeInFlight(int timeInFlight) {
		this.timeInFlight = timeInFlight;
	}


	public static void main(String[] args) {
		SpringApplication.run(MsAirplaneApplication.class, args);
	}

}
