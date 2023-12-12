package com.day22;
// Hierarical Inheritance

class Vehicles{
	void noOfEngine() {
		System.out.println("I have a Engine");
	}
}



class TwoWheelers extends Vehicles {
	void noOfWeels() {
		System.out.println("I have Two Wheels");
	}
}

class Bikes extends Vehicles{
	
	void brandName() {
		System.out.println("My Brand Name is Honda");
	}


	


}
class ElectricV extends Vehicles{
	
	void powerConsume() {
		System.out.println("I am A Electrical Vehicle");
	}
}

public class HieraricalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bikes b= new Bikes ();
		ElectricV ev = new ElectricV();
		TwoWheelers tw = new TwoWheelers ();
		
		b.brandName();
		ev.powerConsume();
		tw.noOfWeels();
		tw.noOfEngine();
		
		
	}

}
