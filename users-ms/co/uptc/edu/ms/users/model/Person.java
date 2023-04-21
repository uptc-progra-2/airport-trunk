package model;

public class Person {
	private UserType type;
	private DocType docType;
	private float doctld;
	private String firstName;
	private String lastName;
	private String Phone;
	private String address;
	
	public Person(UserType type, DocType docType, float doctld, String firstName, String lastName, String phone,
			String address) {
		this.type = type;
		this.docType = docType;
		this.doctld = doctld;
		this.firstName = firstName;
		this.lastName = lastName;
		Phone = phone;
		this.address = address;
	}
	
	public UserType getType() {
		return type;
	}
	public void setType(UserType type) {
		this.type = type;
	}
	public DocType getDocType() {
		return docType;
	}
	public void setDocType(DocType docType) {
		this.docType = docType;
	}
	public float getDoctld() {
		return doctld;
	}
	public void setDoctld(float doctld) {
		this.doctld = doctld;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return type + ", " + docType + ", " + doctld + ", " + firstName
				+ ", " + lastName + ", " + Phone + ", " + address;
	}
	
	
}
