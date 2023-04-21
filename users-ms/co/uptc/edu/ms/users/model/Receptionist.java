package model;

public class Receptionist extends Person {
	private double salary;
	
	public Receptionist(UserType type, DocType docType, float doctld, String firstName, String lastName, String phone,
			String address, double salary) {
		super(type, docType, doctld, firstName, lastName, phone, address);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + salary;
	}

	
}
