package com.day3;

class A2{ // Super Class
	A2(){
		
		super(); // object class invoking
		System.out.println("A1"); //1
	}

public A2(int a) {
	// TODO Auto-generated constructor stub
	this();
	System.out.println(a); //2
}
	

}



class B2 extends A2{ // Sub class
	
	
	B2(){// Constructor
	    
this(5); 
		
		System.out.println("B1"); //4
	}
	
B2(int a){// Constructor
	    

		super(a);
		System.out.println("B2");//3
	}
}

public class MulConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B2 b2 = new B2 ();
		
	}

}
