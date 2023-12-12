package com.oops;

abstract class Employee {
	
	int Salary = 15000;
	
	abstract int calculateSalary(); 
	abstract void displayInfo();
		
		
		
	
}

class Manager extends Employee{
	
	int calculateSalary() {
		
		System.out.println("In Manager can get Salary 40k per month");
		
		int Salary = 40000;
		
		return Salary;
	}

	@Override
	void displayInfo() {
		System.out.println("Manager Salary is Credited in his account.......");
		
	}
	
}

class Programmer extends Employee {
	
	int calculateSalary() {
		
		System.out.println("In Programmer can get Salary 25K per month");
		
		int Salary = 25000;
		
		return Salary;
	}

	@Override
	void displayInfo() {
	System.out.println("Programmer Salary is Credited in his account.......");
		
	}
}

public class EmployeeAbstraction {

	public static void main(String[] args) {
		
        Manager m = new Manager(); // Object creation for Manager class
		
		Programmer p = new Programmer (); // Object creation for Programmer class
		
		
		System.out.println(m.calculateSalary());
		
		m.displayInfo();
		
		System.out.println("****************************************************");
		
		
		System.out.println(p.calculateSalary());
		
		p.displayInfo();
		
	}

}
