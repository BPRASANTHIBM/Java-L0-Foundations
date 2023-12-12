package com.day5Assignment;


abstract class  BankAccount{
	
	abstract void deposit();
	abstract void withdraw();
	
}

class SavingsAccount  extends BankAccount{
	

	@Override
	void deposit() {
		//System.err.println("HEllo");
		System.out.println("In Savings Account I Deposit 500Rs....");
	}

	@Override
	void withdraw() {
		
		System.out.println("In Savings Account I Withdraw 1000Rs...your last transaction");
	}

		
}

class CurrentAccount extends BankAccount{

	@Override
	void deposit() {
		System.out.println("In Current Account I Deposit 1500Rs....");
		
	}

	@Override
	void withdraw() {
		
		System.out.println("In Current Account I Withdraw 1700Rs...your last transaction");
	}

	
	
	
}



public class BankAccountAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new CurrentAccount().deposit();
		new CurrentAccount().withdraw();
		
		System.out.println("***************************************************");
		
		
		new SavingsAccount().deposit();
		new SavingsAccount().withdraw();

		
		
	}

}
