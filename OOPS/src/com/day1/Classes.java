package com.day1;

class Employee {
	//Variables
	int eid;
	String ename;
	float esalary;
	
	
	//constructor
	
	Employee(int id, String name , float salary){
		
		this.eid= id;
		this.ename = name;
		this.esalary= salary;
		
	}
	
	//Methods
	void display(int a, int b) {
		System.out.println("Employee id :"+eid);
		System.out.println("Employee name :"+ename);
		System.out.println("Employee Salary :"+esalary);
		System.out.println(a);
		System.out.println(b);
	}
	
}




public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//obj creation
		Employee e = new Employee(1001,"Prashanth",600.50f);
		e.display(5,6);
		System.out.println("*************************************************");
		Employee e1 = new Employee(1002,"Prem",(float)800.50);
		e1.display(7,9);
	}

}
