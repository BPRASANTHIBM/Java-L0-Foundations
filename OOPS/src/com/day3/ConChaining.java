package com.day3;

class A1{ // Super Class
	A1(){
		System.out.println("A1");
	}
	
public int show (int a , String b) {
	System.out.println("print");
	return 1;
}
public void show (String a , int b) {
	System.out.println("print");
	//return 2;
}
}



class B1 extends A1{ // Sub class
	
	
	B1(){// Constructor
	    

		
		System.out.println("B1");
	}
}

public class ConChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b = new B1();
		
		System.out.println(b.show(0, "abi"));
		b.show("abi", 1);
		
		
	}

}
