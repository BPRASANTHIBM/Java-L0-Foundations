package com.day3;

// By using Extends key we can't inherits everything without constructor and private properties



class A3{ // Super Class
	int a = 5;
	private int b =0; // we can't inherit that b variable

	
	
		public int getB() {
		return b;
	}
//	public void setB(int b) {
//		this.b = b;
//	}
	
	
	
	
	
	
	
}
class B3 extends A3{
	int a = 10 ;
	
	
	
	
	
	B3(){
		
		int a=7;
		
		System.out.println(a); // Current class Var invoking
		System.out.println(super.a); //Super Class Var Invoking
		
	
		display(); // method calling 
	
	}
	
	void display() {
		System.out.println(a+super.a);
	}
}


public class SuperCallVar {

	public static void main(String[] args) {
		
		
		B3 b3 = new B3();
		System.out.println(b3.getB());

		
	}

}
