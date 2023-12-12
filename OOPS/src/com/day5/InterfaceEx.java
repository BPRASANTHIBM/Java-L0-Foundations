package com.day5;



//interface to class we can use implements keyword bcoz extends keyword can looking for the 
// parent constructor , but interfaces are doesn't have any constructor so we can use Implements keyword


interface VehiclePlan {
	void noOfWheels();
	void noOfEngine();
	void brandName();
	
	
	
	
}


abstract class Vehicles implements VehiclePlan{
	
	public Vehicles() {
		
		System.out.println("**********Constructor***************");
	}
	public void noOfEngine() {
		System.out.println("I Have a Engine");
	}
	@Override
	public void brandName() {
		System.out.println("My brand name is Hero");
		
	}
	@Override
	public void noOfWheels() {
		System.out.println("I have a 2 Wheels");
	}
	
public abstract void breakss();
	
}


public class InterfaceEx extends Vehicles{

	public static void main(String[] args) {
		InterfaceEx e = new InterfaceEx();
		
		e.brandName();
		e.breakss();
		e.noOfEngine();
		e.noOfWheels();
		
		
	}
	@Override
	public void breakss() {
	System.out.println("I have a Break");
	}
	

	
	
	
	
	
	
	
	
	

}
