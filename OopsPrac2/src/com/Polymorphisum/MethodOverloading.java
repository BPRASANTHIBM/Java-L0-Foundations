package com.Polymorphisum;

class vehicle{
	public int car (int a, int b ) {
		
		int sum = a+b;
		return sum;
		
	}
	
	public double car (int a , int b , int c) {
		int sum = a+b+c;
		
		return sum;
		
	}
}



public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Method overloading 
		// Same Class , Same Method Name , differ Parameter
		// use - code more readability
		
		vehicle s = new vehicle ();
		
		
		
		System.out.println(s.car(5,5));
		System.out.println(s.car(5,5,5));
		
		
		
	}

}
