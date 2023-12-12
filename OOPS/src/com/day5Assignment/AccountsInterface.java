package com.day5Assignment;

import java.util.Scanner;

interface BankAccounts{
	int deposit(int dep);
	int Withdraw (int with);
	int calculateInterest(int calInt);
	int viewBalance(int Balance);

 
	
	
}

class SavingsAccounts implements BankAccounts{

	

	@Override
	public int deposit(int dep) {
		System.out.println(".........Your Amt Successfully credited.........");
		return dep;
	}

	@Override
	public int Withdraw(int with) {
		System.out.println(".........You withdrawed amt is debited..........");
		return with;
	}

	@Override
	public int calculateInterest(int calInt) {
		
		int Interest = calInt * 9 * 12;
		
		return Interest;
	}

	@Override
	public int viewBalance(int Balance) {
		
		System.out.println("..................Your Balance View Below..............");
		
		return Balance;
	}
	
	
}

class CurrentAccounts implements BankAccounts{

	@Override
	public int deposit(int dep) {
	
		System.out.println(".........Your Amt Successfully credited.........");
		return dep;
	}

	@Override
	public int Withdraw(int with) {
		System.out.println(".........You withdrawed amt is debited..........");
		return with;
	}

	@Override
	public int calculateInterest(int calInt) {
		
int Interest = calInt * 9 * 12;
		
		return Interest;
	}

	@Override
	public int viewBalance(int Balance) {
		
System.out.println("..................Your Balance View Below..............");
		
		return Balance;
	}
	
}

public class AccountsInterface {

	public static void main(String[] args) {
		
		
Scanner sc = new Scanner(System.in);

System.out.println("Enter the Account Details : \n1.Savings Account\n2.CurrentAccount");

int o = sc.nextInt();

SavingsAccounts S = new SavingsAccounts();

CurrentAccounts C = new CurrentAccounts();



switch (o) {
case 1:
	
	System.out.println("***********Your Selected Option is Savings Account************");
	
	System.out.println("Enter the Details you want??? \n1.Deposit \n2.Withdraw\n3.CalculateInterst"
			+ "\n4.View Balance");
	
	int s = sc.nextInt();
	
	
	
	switch (s) {
	case 1:
		
		System.out.println("Enter the Deposite Amount :");
		
		int D = sc.nextInt();
		
		
		
		System.out.println(S.deposit(D));
		
		
		
		break;
		
	case 2:
		
		System.out.println("Enter the WithDraw Amount :");
		
		int W = sc.nextInt();
		
		System.out.println(S.Withdraw(W));
		
		break;
		
	case 3:
		
		System.out.println("Enter the Interest Amount :");
		
		int I = sc.nextInt();
		
		System.out.println(S.calculateInterest(I));
		
		break;
		
	case 4:
		
		int Balance = 10000 ;
		System.out.println(S.viewBalance(Balance));
		
		break;
	default:
		break;
	}
	
	break;

default:
	break;
	
	
case 2:
	
	System.out.println("***********Your Selected Option is Current Account************");
	
	System.out.println("Enter the Details you want??? \n1.Deposit \n2.Withdraw\n3.CalculateInterst"
			+ "\n4.View Balance");
	
	int n = sc.nextInt();
	
	
	
	switch (n) {
	case 1:
		
		System.out.println("Enter the Deposite Amount :");
		
		int D = sc.nextInt();
		
		System.out.println(C.deposit(D));
		
		
		
		break;
		
	case 2:
		
		System.out.println("Enter the WithDraw Amount :");
		
		int W = sc.nextInt();
		
		System.out.println(C.Withdraw(W));
		
		break;
		
	case 3:
		
		System.out.println("Enter the Interest Amount :");
		
		int I = sc.nextInt();
		
		System.out.println(C.calculateInterest(I));
		
		break;
		
	case 4:
		
		int Balance = 10000 ;
		System.out.println(C.viewBalance(Balance));
		
		
		break;
	default:
		break;
	}
	
	break;


	
	
}



		
	}

}
