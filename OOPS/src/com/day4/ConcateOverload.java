package com.day4;

// Adv : Adding Extra functionality not removing anything instead of adding updates

public class ConcateOverload {
	
	void Concatination(int a , int b) {
		
		System.out.println(" The Int ConCate :"+a +" "+b);
		
	}
	
	void Concatination(float a , float b) {
		
		System.out.println(" The Float ConCate :"+a +" "+b);
		
	}
	
	void Concatination(String a , String b) {
		
		System.out.println(" The String ConCate :"+(a+b));
	}
	
	
	void Concatination(boolean a , boolean b) {
		
		
		System.out.println(" The Boolean ConCate :"+a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcateOverload c = new ConcateOverload();
		
		c.Concatination(3, 2);
		c.Concatination(2.0f, 4.0f);
		c.Concatination("Prasanth ", "Software Engineer");
		c.Concatination(true, false);
		
	}

}
