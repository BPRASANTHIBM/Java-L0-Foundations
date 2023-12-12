package com.practice;


class Vicky{
	
	
	int vi = 4;
	
	public static void display() {
		
		
		System.out.println("I am the the first one");
	}
	
	
	protected void print () {
		System.out.println("Hi");
	}
}

class Abi extends Vicky{

	public static void display() {
		System.out.println("I");
		
		
		
	}
	
	public final  void print() {
		
		System.out.println("1");
	}
	
	
	
	
}

public class StaticBlock {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Vicky v = new Abi ();
	
	v.display();
	v.print();
		
	}

}
