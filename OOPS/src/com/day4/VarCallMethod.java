package com.day4;


class A1{
	
	
	String s = MyMethod();

	public String MyMethod() {
		// TODO Auto-generated method stub
		return "A";
	}
}

class A2 extends A1{
	
	public String MyMethod() {
		
		return "B";
	}
	
}



public class VarCallMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A2 a2 = new A2 ();
		System.out.println(a2.s);
		
		
	}

}
