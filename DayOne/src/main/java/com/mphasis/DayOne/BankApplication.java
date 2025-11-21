package com.mphasis.DayOne;

public class BankApplication {

	public static void main(String[] args) {
       SavingAccount sa = new SavingAccount(46457,"Daiveek kj","AXIS","AXIS876");
       System.out.println(sa);
      
       sa.deposit(30000);
       sa.withDraw(5000);
       sa.getBalance();
	} 

}
