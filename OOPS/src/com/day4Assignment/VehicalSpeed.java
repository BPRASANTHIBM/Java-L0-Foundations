package com.day4Assignment;

class vehicle {
	
	void speed() {
		
		System.out.println("Every Vehicle can speed up");
	}
	
}

class car extends vehicle {
	
	void speedup() {
		
		System.out.println("Car can speed up with max 200 kmph");
	}
	
}

class Bicycle extends car{
	@Override
	void speedup() {
		
		System.out.println("Bicycle can speed up with max 40 kmph");
	}
}

public class VehicalSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bicycle b = new Bicycle ();
		
		b.speedup();
		
		car c = new car ();
		
		c.speedup();
		
	}

}
