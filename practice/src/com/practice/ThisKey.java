package com.practice;

public class ThisKey {
	
	
	
public int a;  // fields
public int b;

{ // Anonymous block 
	System.out.println("I'm the one ");
}

ThisKey(){
	this (200,300); //way 1 this keyword can use as a method , to pass the arrguments via this keyword to another constructor
	
	System.out.println("************First Print*****************");
	
	
}



ThisKey(int a, int b){
	
	this.a= a; // way 5 this keyword perform current class instance
	this.b=b;
	
	System.out.println("The value a is "+a);
	System.out.println("The value b is "+b);
	
}

ThisKey get() {  // way 2 this keyword return the this to call the constructor to get the value of diaplay method to print the value
	return this;
}
	public void display() {
		System.out.println(a);
		System.out.println(b);
		this.get2(); //way 4 this keyword to call the method
	}
	
	
	public void get1(ThisKey obj) { // way 3 this keyword pass the method parameter 
		
		System.out.println(a+b);
		
	}
	
	public void display1() {
		get1(this);
	}
	
	public void get2() {
		// TODO Auto-generated method stub

		System.out.println("Hello all");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	ThisKey th = new ThisKey();
	 th.get().display();
	 th.display1();
		
		
		
	}

}
