package com.Oop1;

class Parent {
	int a= 22;
	int b = 4;
}

class child extends Parent{
	int c = 81;
	
	public void display(int a){
   this.a = a;
		System.out.println(a+b+c); // 88+4+81 = 173
}
}



public class SingleInheritance {

	public static void main(String[] args) {
		
		
			// TODO Auto-generated method stub

//			Inheritance in Java is a mechanism in 
//			which one object acquires all the properties and behaviors of a parent object.
//			It is an important part of OOPs (Object Oriented programming system).
			
	//Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
		child c = new child();	
		
		c.display(88);
	}
		// TODO Auto-generated method stub

	}


