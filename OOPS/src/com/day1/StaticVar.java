package com.day1;

public class StaticVar {

	static int a = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1 = 5; // local variable must be initialize

		InstanceAndStatic i = new InstanceAndStatic();
		InstanceAndStatic j = new InstanceAndStatic();
		
		System.out.println(i.a);//10
	     System.out.println(j.a);//10
	     
	     
	     i.a=20;
	     
	     System.out.println(i.a); //20
	     System.out.println(j.a); //20
	     System.out.println();
	     
	     System.out.println("**********local variable***********");
		System.out.println(a1);
	}
}
