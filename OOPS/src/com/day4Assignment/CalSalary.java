package com.day4Assignment;

class Employee {
	
	int Salary = 15000;
	
	int calculateSalary() {
		
		System.out.println("Every Employee Can get Salary");
		
		return Salary;
		
	}
}

class Manager extends Employee{
	
	int calculateSalary() {
		
		System.out.println("In Manager can get Salary 40k per month");
		
		int Salary = 40000;
		
		return Salary;
	}
	
}

class Programmer extends Manager {
	
	int calculateSalary() {
		
		System.out.println("In Programmer can get Salary 25K per month");
		
		int Salary = 25000;
		
		return Salary;
	}
}


public class CalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Manager().calculateSalary());
		
		System.out.println(new Programmer().calculateSalary());
		
		System.out.println(new Employee().calculateSalary());
		
		
		
	}

}
