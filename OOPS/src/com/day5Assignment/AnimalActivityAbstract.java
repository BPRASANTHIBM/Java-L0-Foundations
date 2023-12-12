package com.day5Assignment;


abstract class Animals {
	
	abstract void eat();
	abstract void sleep();

	
	
}

class Lions extends Animals {

	@Override
	void eat() {
		
		System.out.println("Lion can eat Meat foods....");
	}

	@Override
	void sleep() {
		
		System.out.println("Lion  sleep inside the  Own Den");
	}
	
	
}

class Tigers extends Animals{

	@Override
	void eat() {
		
		System.out.println("Tiger can also eat Meat Foods...");
		
	}

	@Override
	void sleep() {
		System.out.println("Tiger  sleep  inside  Cooling places");
	}
	
}

class Deer extends Animals{

	@Override
	void eat() {
		
		System.out.println("Deer Can eat vegetarian only foods .....");
	}

	@Override
	void sleep() {
		
		System.out.println("Deer can eat under the Pine trees....");
		
	}
	
	
}

public class AnimalActivityAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Lions l =	new Lions();
	Tigers t = new Tigers();
	Deer d = new Deer ();
	
	l.eat();
	l.sleep();
	
	System.out.println("****************************************");
	
	t.eat();
	t.sleep();
	
	System.out.println("*****************************************");
	
	
	d.eat();
	d.sleep();
	
	
			
		
	}

}
