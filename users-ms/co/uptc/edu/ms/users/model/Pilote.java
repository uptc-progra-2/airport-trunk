package model;

public class Pilote extends Person {
	private PiloteType piloteType;
	private AirplaneType airplaneType;
	private int hoursFly;
	private double salary;
	
	public Pilote(UserType type, DocType docType, float doctld, String firstName, String lastName, String phone,
			String address, PiloteType piloteType, AirplaneType airplaneType, int hoursFly, double salary) {
		super(type, docType, doctld, firstName, lastName, phone, address);
		this.piloteType = piloteType;
		this.airplaneType = airplaneType;
		this.hoursFly = hoursFly;
		this.salary = salary;
	}

	public PiloteType getPiloteType() {
		return piloteType;
	}

	public void setPiloteType(PiloteType piloteType) {
		this.piloteType = piloteType;
	}

	public AirplaneType getAirplaneType() {
		return airplaneType;
	}

	public void setAirplaneType(AirplaneType airplaneType) {
		this.airplaneType = airplaneType;
	}

	public int getHoursFly() {
		return hoursFly;
	}

	public void setHoursFly(int hoursFly) {
		this.hoursFly = hoursFly;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + piloteType +", " + airplaneType + ", " + hoursFly
				+ ", " + salary;
	}

	
	
	

}
