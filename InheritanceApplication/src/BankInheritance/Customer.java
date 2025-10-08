package BankInheritance;

public class Customer {
	private int custId;
	private String custName;
	private Address addr;
	private Account acc;
	public Customer(int custId, String custName, Address addr, Account acc) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.addr = addr;
		this.acc = acc;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
}
