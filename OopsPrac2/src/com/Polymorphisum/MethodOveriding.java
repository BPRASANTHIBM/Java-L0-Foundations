package com.Polymorphisum;

class school{
	Integer Age ;
	String Name ;
	String CurrentAdd ;
	
	
	
public void display(int Age, String Name, String CurrentAdd) {
	this.Age = Age ;
	this.Name = Name;
	this.CurrentAdd = CurrentAdd;
	
	System.out.println("My Current Age in a School :" +Age);
	System.out.println("My name is :"+Name);
	System.out.println("My Address is : "+CurrentAdd);
	
	System.out.println("*****************Original Method Printed********************");
	
}
	
	
}

class college extends school{
	Integer Age ;
	String Name ;
	String CurrentAdd ;
	
	
	
	
	@Override
public void display(int Age, String Name, String CurrentAdd) {
	this.Age = Age ;
	this.Name = Name;
	this.CurrentAdd = CurrentAdd;
	
	System.out.println("**************Override Method Printed******************");
	
	System.out.println("My Current Age in a School :" +Age);
	System.out.println("My name is :"+Name);
	System.out.println("My Address is : "+CurrentAdd);
	
	
	
	}	
	
}



public class MethodOveriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Method overriding is nothing but it is one of polymorphisum concept, like we have to achieve the 
// polymorphisum to follow the some of rules they are , same method name , same parameter, different classes
		
// Is-a- reletionships (Like a Inheritance)
		college c = new college ();
		
		c.display(5, "Prasanth", "Chennai");
		
		
		
		
	}

}
