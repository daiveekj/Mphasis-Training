package com.mphasis.DayOne;

abstract public class Account {
	private int accountNumber;
	private String accountName;
	private String accountBalance;
	private String ifsc;
	private int accountPin;

	public Account(int accountNumber, String accountName, String accountBalance, String ifsc) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
		this.ifsc = ifsc;
		this.accountPin = generatePin();
	}

	private int generatePin() {
		int newPin = (int) Math.round(Math.random() * 10000);
		return newPin;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public int getAccountPin() {
		return accountPin;
	}

	public void setAccountPin(int accountPin) {
		this.accountPin = accountPin;
	}

	public void withDraw(double amount) {
		System.out.println("Accounts withdraw");
	}

	public void deposit(double amount) {
		System.out.println("Amount deposited");
	}
}
