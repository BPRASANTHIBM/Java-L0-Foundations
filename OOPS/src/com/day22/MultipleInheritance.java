package com.day22;


	class Vehicle{
		void noOfEngine() {
			System.out.println("I have a Engine");
		}
	}
	
	
	
	class TwoWheeler extends Vehicle {
		void noOfWeels() {
			System.out.println("I have Two Wheels");
		}
	}

	class Bike1 extends TwoWheeler{
		
		void brandName() {
			System.out.println("My Brand Name is Honda");
		}
	

		
	

}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Bike1 b = new Bike1();
		 
		 b.brandName();
		 b.noOfEngine();
		 b.noOfWeels();
		
		
		
	}

}
