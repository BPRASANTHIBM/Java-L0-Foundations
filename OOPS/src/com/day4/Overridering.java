package com.day4;


// @Overrides time we cant't change the visibility , the Access Modifier will be same and equal visibility
// We can't overrider higher visibility methods like private to public


class Vehicle {
	
	void noOfEngine() {
		
		System.out.println("I Have a one engine");
	}
	
	protected void noOfWeels() {
		
		System.out.println("All the Vehicles has Weels");
	}
}

class TwoWeeler extends Vehicle{

	
@Override
public void noOfWeels() {
		
	super.noOfEngine();
	
		System.out.println("I have a Two Weels");
	}
	
}



public class Overridering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoWeeler t = new TwoWeeler();
		
		t.noOfEngine();
		t.noOfWeels();
		
		System.out.println("****************************************************************");
		
		Vehicle tw = new TwoWeeler(); // Dynamic Method Dispatch (DMD) or Upcasting
		
		tw.noOfEngine();
		tw.noOfWeels();
		
		// We can't Overrides Static Method and Constructor , Final Method 
		
		
	}

}
