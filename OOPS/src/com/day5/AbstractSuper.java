package com.day5;

// can't make abstract method and class as a static bcoz abstract class are must override


abstract class flight {
	
	void noOfWheels(){
		
		System.out.println("I have 3 Wheels");
	}
	
	// Constructor - Parent
	public flight(int cost) {
		System.out.println("The Flight min cost is :"+cost);
	}
	
	abstract void flightName();
	abstract void flightCost();
	
	
	
}





class AirCraft extends flight{

	@Override
	void flightName() {
		System.out.println("I am A kingFisher");
		
	}

	@Override
	void flightCost() {
		System.out.println("My Cost is Min 2k");
		
	}
	// Constructor - child
	public AirCraft() {
	super(1000);
	}
	
	
	
}





public class AbstractSuper {
	
	
	

	public static void main(String[] args) {
		
		AirCraft a = new AirCraft();
		
		a.flightCost();
		a.flightName();
		
		
	}

}
