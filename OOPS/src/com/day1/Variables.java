package com.day1;

public class Variables {
	
	int a = 10;  // Instance or Object Variable
	static int b =20; // Static or Class Variable
	

	public static void main(String[] args) {
		
		int c = 30; // local variable
		System.out.println("The c value is:"+c);
		Variables obj = new Variables();
		
		System.out.println(obj.a); //10
		
		System.out.println(Variables.b);//20
		
		
	}

}
