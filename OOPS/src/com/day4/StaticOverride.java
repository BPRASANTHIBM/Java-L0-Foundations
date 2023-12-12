package com.day4;


class Vehicle1 {
	
	void noOfEngine1() {
		
		System.out.println("I Have a one engine");
	}
	
	static void noOfWeels1() {
		
		System.out.println("All the Vehicles has Weels");
	}

	void noOfWeels2() {
		// TODO Auto-generated method stub
		
	}
}

class TwoWeeler1 extends Vehicle1{

	
static void noOfWeels1() { // Static We Don't Override
		
	//super.noOfEngine();
	
		System.out.println("I have a Two Weels");
	}
	
}


public class StaticOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehicle1 v = new TwoWeeler1();

v.noOfEngine1();
v.noOfWeels1();
		
	}

}
