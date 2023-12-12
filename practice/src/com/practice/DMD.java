package com.practice;


class A  {
	String a = "Sundar";
	
	String display() {
		System.out.println("The method Diplay");
		return "Child";
	}
	
}

class B extends A{
	
	String a = "Srini";

	
	@Override
	String display() {
		System.out.println("The method Diplay");
		
		return "Parent";
	}
}

public class DMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	B c = new B(); // Upcasting or DMD
	
	System.out.println(c.a + " " +c.display());
		
		
	}

}
