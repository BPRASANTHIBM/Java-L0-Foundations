package com.day2;

public class InstanceBlockEx {
	
	

	{
		
	
	System.out.println("The Start");	
	
	// nested block
	{
		System.out.println("I am a nested block inside the ananymous block");
	}

	}
	
	
	{
	
	System.out.println("The End");	
	
	
	}
	
	
	InstanceBlockEx(){
		
		System.out.println("I am the first Costructor");
	}
	
InstanceBlockEx(String Parameter){
		
		System.out.println("I am the Parameter first "+Parameter);
	}

void display() {
	System.out.println("I am the method");
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		InstanceBlockEx x = new InstanceBlockEx();
		
		InstanceBlockEx y = new InstanceBlockEx("Constructor");
		
		x.display();
		
		
		
			
		
		
	}

}
