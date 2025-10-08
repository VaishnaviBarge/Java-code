package Model;

public class Address {
	private String city;
	private String State;
	private int pinCode;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(String city, String state, int pinCode) {
		super();
		this.city = city;
		State = state;
		this.pinCode = pinCode;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	public int getPinCode() {
		return pinCode;
	}


	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
	
}
