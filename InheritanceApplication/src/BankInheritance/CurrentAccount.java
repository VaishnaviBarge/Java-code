package BankInheritance;

public class CurrentAccount extends Account{
	
	private String companyName;
	
	public CurrentAccount(int accNumber, String accType, int accBal, String ifscCode, String companyName) {
		super(accNumber, accType, accBal, ifscCode);
		this.companyName=companyName;
	}


	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	
	
}
