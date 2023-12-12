package com.task1;

//1.Write a program to create a class named Vehicle having protected instance variables
//regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a
//vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having
//individual private instance variables routeNumber in Bus and manufacturerName in Car
//and both of them having showData ( ) method showing all details of Bus and Car
//respectively with content of the super class’s showData ( ) method.

class Vehicle{
	
	protected int regNumber;
	protected String speed ;
	protected String color;
	protected String ownerName;
	
	public void showData() {
		System.out.println("This is a vehicle class");
	}
	
	
}

class Bus extends Vehicle{
	private int routeNumber;
	
	Bus(){
		regNumber = 12119;
		routeNumber= 01;
		speed = "200 kmph";
		color = "Yellow";
		ownerName= "Prasanth";
	}
	
	public void showData() {
		super.showData();
		System.out.println("***********This is a Bus class*****************");
		
		System.out.println("The Bus Reg No is "+regNumber +"\nBus Speed is :"+speed +"\nBus Color is :"+color+
				"\nRoute Number is :"+routeNumber
				+"\nBus Owner Name is :"+ownerName);
		
	}
	
	
	
	
}

class Car extends Vehicle{
	private String manufacturerName;
	
	Car(){
		regNumber = 13330;
		manufacturerName= "Abishek";
		speed = "350 kmph";
		color = "Green";
		ownerName= "Prasanth Owner";
	}
	
	public void showData() {
		System.out.println("*****************This is a Car class*************************");
		
		System.out.println("The Car Reg No is "+regNumber +"\nCar Speed is :"+speed +"\nCar Color is :"+color+
				"\nmanufacturer Name  is :"+manufacturerName
				+"\nBus Owner Name is :"+ownerName);
	}
	
}




public class Automobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		Bus b = new Bus();
		
		b.showData();
		c.showData();
		
	}

}
