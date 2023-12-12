package com.day2;

import java.lang.annotation.Inherited;

// SIngle Inheritance

class TwoWheeler {
	void noOfWeels() {
		System.out.println("I have Two Wheels");
	}
}

class Bike extends TwoWheeler{
	
	void brandName() {
		System.out.println("My Brand Name is Honda");
	}
}


public class Inheritance {

	public static void main(String[] args) {
	
	Bike b = new Bike();
	b.brandName();
	b.noOfWeels();

//	String s = new String ("HEllo");
//	System.out.println(s);
	
	}

}
