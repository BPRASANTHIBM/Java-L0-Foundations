package com.day4;

class SuperClass{
	
	void myMethod () {
		System.out.println("Super Class Method");
	}

	
}

class SubClass extends SuperClass{
	
	
	@Override
	void myMethod() {
		
		super.myMethod();
		System.out.println("Sub Class Method ");
	}
}



public class MethodOverriding {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClass s = new SubClass();
		
		s.myMethod();
		

	}

}
