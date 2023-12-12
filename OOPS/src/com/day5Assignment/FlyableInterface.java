package com.day5Assignment;

interface Flyable {
	
	void fly_obj();
}

class SpaceCraft implements Flyable {

	@Override
	public void fly_obj() {
		System.out.println("SpaceCraft mostly using Space Research purpose....");
		
	}
	
	
}
class AirPlane implements Flyable {

	@Override
	public void fly_obj() {
		System.out.println("Airplane mostly using for Travelling and Export & Imports ");
		
	}
	
	
}
class Helicopter implements Flyable {

	@Override
	public void fly_obj() {
		System.out.println("Helicopter mostly using for Defence and Personal Travellings..");
		
	}
	
	
}


public class FlyableInterface {

	public static void main(String[] args) {
		
		Flyable s = new SpaceCraft ();
		Flyable a = new AirPlane();
		Flyable h = new Helicopter();
		
		
		s.fly_obj();
		System.out.println("****************************");
		
		
		a.fly_obj();
		
		System.out.println("****************************");
		h.fly_obj();

	}

}
