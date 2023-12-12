package com.day4Assignment;

class Animal{
	
	void Speak() {
		System.out.println("All the animals can Speak");
	}

	
}

class Bird extends Animal{
	
	void Sound() {
		
		System.out.println("Bird Can sound like a melody...");
	}
}

class cat extends Bird {
	
	@Override
	void Sound () {
		System.out.println(" Cat can sound Meow...");
		
	}
}

public class AnimalSounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cat c = new cat();
		
		c.Sound();
		Bird b = new Bird ();
		b.Sound();
		
	}

}
