package com.day4;

public class Polymorphisum {
	// Polymorphisum
	
	/********** Compile time polymhorphisum ***************************/
	//1. Overolading  -  1. Method overloading 2.Constructor Overloading
	
	// Parameters will change to achieve the method overloading like change,
	// 1.no of args change 
	// 2. order of args
	// 3.type of args change
	
	// var can take a memory during the Compile time * - In stack memory
	
	/*********** Run time polymhorphisum *************************/
	
	// 2.Method Overriding 
	
	
	void myMethod() {
		
		System.out.println("Welcome All");
		
	}
	
	
   void myMethod(int n) {
		
	System.out.println(n*n+Math.PI);
	   
	   
	}
   
   
	
	void myMethod(String name ) {
		
		   System.out.println("Welcome"+ " " +name);
	}
	
	void myMethod (int a , int b) {
		
	System.out.println(a+b);
		
	}
   
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphisum p = new Polymorphisum();
		
		p.myMethod(); // Call 1st Method
		
		
		p.myMethod(2); // Call 2nd Method
		
		
		p.myMethod("Prashanth");// Call 3rd Method
		
		p.myMethod(5, 6);// Call 4th Method
		
		
	}

}
