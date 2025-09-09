package BankInheritance;

public class SavingAccount extends Account {
	private float interestRate;

	public SavingAccount(int accNumber, String accType, int accBal, String ifscCode, float interestRate) {
		super(accNumber, accType, accBal, ifscCode);
		this.interestRate=interestRate;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	


}
