package com.day5;


/*
 * Abstract Class - (0 - 100% Abstraction )
 */


// We Can't create object for abstract class but we can create reference of the class 

/*becoz it is a  incomplete class , we have declered only some of decleration and 
* some of Implementations.
*/

//  normal class doesn't accept the abstract class then only we can create or override the parent 
// abstract class then only the errors are rectifing.



abstract class Vehicle { // -> Building
	void noOfEngine() {
		
		System.out.println("I have one Engine ");
	}
	
	
	public Vehicle() {
		System.out.println("I am A constructor");
	}
	
	
	abstract void noOfWheels();
	
	abstract void brandName();
	
	abstract void breaks ();
	
	
}

//  We Have create N no of abstract class for extends with child class

abstract class TwoWeeler extends Vehicle {
	
	
	@Override
	void breaks () {
		System.out.println("I have two breaks");
	}
	
}

class Bike extends TwoWeeler {

	@Override
	void noOfWheels() {
		System.out.println("I have a Two Wheels");
		
	}

	@Override
	void brandName() {
		System.out.println("I have a Brand Name Honda");
		
	}
	
	
	
	
}


public class Abstraction {

	public static void main(String[] args) {
		
		
		Vehicle v = new Bike (); // DMD or Upcasting the Parent class
		
		v.noOfEngine();
		v.brandName();
		v.noOfWheels();
		v.breaks();
		
		
	}

}
