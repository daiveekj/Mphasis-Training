package com.mphasis.DayOne;

public class SavingAccount extends Account {
	private double Balance;

	public SavingAccount(int accountNumber, String accountName, String accountBalance, String ifsc) {
		super(accountNumber, accountName, accountBalance, ifsc);

	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [Balance=" + Balance + ", getBalance()=" + getBalance() + ", getAccountNumber()="
				+ getAccountNumber() + ", getAccountName()=" + getAccountName() + ", getAccountBalance()="
				+ getAccountBalance() + ", getIfsc()=" + getIfsc() + ", getAccountPin()=" + getAccountPin()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
 @Override
	public void withDraw(double amount) {
		if(amount < this.Balance) {
			this.Balance= this.Balance-amount;
			System.err.println("withdrwa success");
		}
		else {
			System.err.println("Withdraw not successfull");
		}
	}
	public void deposit(double amount) {
		this.Balance = this.Balance + amount;
	}
	
}
