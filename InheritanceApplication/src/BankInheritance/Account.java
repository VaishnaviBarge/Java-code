package BankInheritance;

public class Account {
	private int accNumber;
	private String accType;
	private int accBal;
	private String ifscCode;
	public Account(int accNumber, String accType, int accBal, String ifscCode) {
		super();
		this.accNumber = accNumber;
		this.accType = accType;
		this.accBal = accBal;
		this.ifscCode = ifscCode;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getAccBal() {
		return accBal;
	}
	public void setAccBal(int accBal) {
		this.accBal = accBal;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
}
