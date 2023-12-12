package com.day1;

public class InstanceAndStatic {
	
	static int a = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a1 = 5; // local variable must be initialize

  // static int e = 5; we couldn't use static method inside declare a static variable
   
   
		InstanceAndStatic i = new InstanceAndStatic();
		InstanceAndStatic j = new InstanceAndStatic();
		
		System.out.println(i.a);//10
	     System.out.println(j.a);//10
	     
	     
	     
	     i.a=20;
	     
	     System.out.println(i.a); //20
	     System.out.println(j.a); //20
		System.out.println(InstanceAndStatic.a);//20
		System.out.println("*************local variable***************");
		
		System.out.println(a1);
		
		
		
		
		
	}
	private void view () {
//		int a = 6;
	}

}
