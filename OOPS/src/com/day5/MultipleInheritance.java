package com.day5;

interface One {
	int a = 10; // public , Static and final
	int c = 30;
}

interface Two {
	
	int b = 20 ;
	
	int c = 40;
	
}

interface Three extends One,Two {
	
	void sum ();
	
}


public class MultipleInheritance implements Three { 

	public static void main(String[] args) {
		
		MultipleInheritance  mi = new MultipleInheritance() ;
	
        mi.sum();
	}

	@Override
	public void sum() {
		
		// To rectify the ambiguty use class name.var name
		
		System.out.println(a + b + One.c + Two.c);
		
	}

}
