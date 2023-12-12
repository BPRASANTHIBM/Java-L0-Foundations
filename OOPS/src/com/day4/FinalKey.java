package com.day4;


final class Parent {
	
	final void prebaby () {
		System.out.println("Premeture  baby");
	}
	
	
}
 class Parent1 {
	void a () {
		System.out.println("Final class we can't extends");
	}
	
}

class child extends Parent1 {
	
	void a() {
		System.out.println("Final Method Also We Can't Override");
	}
}


public class FinalKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child c = new child ();
		
		Parent p = new Parent ();
		
		
		p.prebaby();
		
		c.a();
       
		
	}

}
