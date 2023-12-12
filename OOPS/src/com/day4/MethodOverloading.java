package com.day4;

public class MethodOverloading {
	
	void addition(int a , int b) {
		System.out.println("Addition value is :"+(a+b));
	}
	
	void addition (int a , int b, int c) {
		
		System.out.println("Addition1 value is :"+(a+b+c));
		
	}
	
	void addition(float a, float b) {
		
		System.out.println("Addition2 value is :"+(a+b));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 MethodOverloading m= new  MethodOverloading();
		 
		 m.addition(2.0f,1.9f);
		 
		 m.addition(8, 7);
		 
		 m.addition(5, 6, 3);
		 
		
	}

}
