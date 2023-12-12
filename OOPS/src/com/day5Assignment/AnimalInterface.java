package com.day5Assignment;

interface Animal${
	
	void bark();
	
}

class Dog implements Animal${

	@Override
	public void bark() {
	System.out.println("Dog is Barking");
		
	}
	
	
}

public class AnimalInterface {

	public static void main(String[] args) {
		
		new Dog().bark();

	}

}
