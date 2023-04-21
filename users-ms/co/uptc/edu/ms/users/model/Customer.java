package model;

public class Customer extends Person{
	private int millas;
	private PaymenthMethod paymenthMethod;
	private Person person;
	
	public Customer(UserType type, DocType docType, float doctld, String firstName, String lastName, String phone,
			String address, int millas, PaymenthMethod paymenthMethod) {
		super(type, docType, doctld, firstName, lastName, phone, address);
		this.millas = millas;
		this.paymenthMethod = paymenthMethod;
	}

	public int getMillas() {
		return millas;
	}

	public void setMillas(int millas) {
		this.millas = millas;
	}

	public PaymenthMethod getPaymenthMethod() {
		return paymenthMethod;
	}

	public void setPaymenthMethod(PaymenthMethod paymenthMethod) {
		this.paymenthMethod = paymenthMethod;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " +  millas + ", " + paymenthMethod;
	}
	
}
