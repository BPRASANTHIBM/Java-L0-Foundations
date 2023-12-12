package com.day5Assignment;


abstract class  Animal{
	
	abstract void sound();
	
}

class Lion extends Animal{

	@Override
	void sound() {
	
		System.out.println("Lion Sounds Like Roar...");
		
	}
	
}

class Tiger extends Animal{

	@Override
	void sound() {
		System.out.println("Tiger Sounds Like Growl....");
		
	}
	
	
}

public class AnimalSoundsAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Tiger().sound();
		new Lion().sound();
		
	}

}
