package com.day4;

class A{
	public A(){
		System.out.println("I am A"); // We Can declare Constructor as a private on that time 
		                              // the inherites will not happen.
	}
}

class B extends A{
	
	 B(){
		System.out.println("I am B");
	}
	
}

public class StopInherite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   B b = new B();
	}

}
