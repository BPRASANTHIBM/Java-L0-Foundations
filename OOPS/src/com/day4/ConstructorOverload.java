package com.day4;

public class ConstructorOverload {
	
	ConstructorOverload (int a , int b){
		System.out.println("Con Concate : "+a+b);
	}
	
ConstructorOverload (float a, float b ){
	
	System.out.println("Con Concate : "+a+b);
	
		
	}

ConstructorOverload (String a, String b){
	
	System.out.println("Con Concate : "+a+b);
	
}
ConstructorOverload (double a, double b ){
	
	System.out.println("Con Concate : "+a+b);
}
	
	
	

	public static void main(String[] args) {
		

		ConstructorOverload c = new ConstructorOverload(5,4);
		
		ConstructorOverload c2 = new ConstructorOverload(3.0f,7.0f);
		
		//System.out.println(new ConstructorOverload("Prasanth ","Baskaran") );
		
		ConstructorOverload c3 = new ConstructorOverload(5.0,4.0);
		
		ConstructorOverload c4 = new ConstructorOverload("Prasanth ","Baskaran");
		
		
		
		
	}

}
