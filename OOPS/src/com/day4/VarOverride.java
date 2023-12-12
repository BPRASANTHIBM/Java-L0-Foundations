package com.day4;


// We Can't Override Variables

class Vehicle2 {
	int a = 60;
	Vehicle2(){
		System.out.println("Parent");
	}
	void noOfEngine2() {
		
		System.out.println("I Have a one engine");
	}
	
	 void noOfWeels2() {
		
		System.out.println("All the Vehicles has Weels");
	}
}

class TwoWeeler2 extends Vehicle2{
  int a = 10;
  
  public TwoWeeler2() {
	
	 System.out.println("Child");
}
	
 @Override
  void noOfWeels2() { 
		
	  super.noOfEngine2();
	
		System.out.println("I have a Two Weels");
	}
	
}


public class VarOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Vehicle2 v2 = new TwoWeeler2(); // DMD
		
		System.out.println(v2.a); // Call Super class Variable 
		v2.noOfEngine2();
		
		// Java DOesn't Support DownCasting
		//TwoWeeler2 t = new Vehicle();		
		
	}

}
