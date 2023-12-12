package com.Oop4;



class capsule {
	
	private String name ;
	
	public String getName() { //getter can get the data
		return name;
	}
	
	public void setName(String name) { // setter can get the data from users
		this.name = name ;
		
	}
	
	
}



public class Encapsulation {
	// Encapsulation is nothing but wrapping the data and code under in a single unit 
	// Basically Encapssulation used for hiding the data itself ;
	// we can access the data using getters and Setters method 
	// becoz the we can hide the datas,we can put the input via set method get the output in 
	// -getName method
	
	//By providing only a setter or getter method, you can make the class read-only or write-only.
	//In other words, you can skip the getter or setter methods.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
capsule c= new capsule ();

c.setName("prasanth");
System.out.println("The name is get from the Getter : "+ c.getName());
		
		
		
	}

}
