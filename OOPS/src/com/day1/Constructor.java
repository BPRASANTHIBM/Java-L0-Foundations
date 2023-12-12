package com.day1;

public class Constructor {
	
	Constructor (){
		this(5); // constructor chaining
		System.out.println("VPP");
		
	}
	Constructor (int a){
		this("Prem");
		System.out.println(a);
	}
	
Constructor (String a){
		
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor c = new Constructor ();
		
	}

}
