package com.day3;
//Super Keyword

class A{ // Super Class
	A(){
		System.out.println("A1");
		
	}
	
	A(int a){
		this(); // to call current class constructor
		System.out.println(a);
	}
}



class B extends A{ // Sub class

	
	B(){// Constructor
	   
		super(5); // to call parent constructor
		
		
		System.out.println("B1");
	}
	

	
}

public class SuperKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		
		
	}

}
