package com.day5Assignment;


abstract class Employees {
	
	int Salary = 15000;
	
	abstract int calculateSalary();
	abstract void displayInfo();
		
		
		
	
}

class Managers extends Employees{
	
	int calculateSalary() {
		
		System.out.println("In Manager can get Salary 40k per month");
		
		int Salary = 40000;
		
		return Salary;
	}

	@Override
	void displayInfo() {
		System.out.println("Manager Salary is Credited in your account.......");
		
	}
	
}

class Programmers extends Employees {
	
	int calculateSalary() {
		
		System.out.println("In Programmer can get Salary 25K per month");
		
		int Salary = 25000;
		
		return Salary;
	}

	@Override
	void displayInfo() {
	System.out.println("Programmer Salary is Credited in your account.......");
		
	}
}
public class EmployeeAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Managers m = new Managers();
		
		Programmers p = new Programmers ();
		
		
		System.out.println(m.calculateSalary());
		
		m.displayInfo();
		
		System.out.println("****************************************************");
		
		
		
		System.out.println(p.calculateSalary());
		
		p.displayInfo();
	}

}
