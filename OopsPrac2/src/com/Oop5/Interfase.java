package com.Oop5;


interface parent {
	public final int value = 10;
	public void display();
	void name();
	void shape();
	static int OrgVal() {
		System.out.println("----static function also have a method body------");
		
		int n = 5;
		return n;
	}
	
}

interface child {
 public  static int  key = 5;
  default void name2() {
	  System.out.println("****Interface have to print  use  dafault Specifier********");
	  display2(); // in java 9 onwards if we call a private method outside the class we can't do
	  
	  // so we can try we to call inside the method  like ex above class void name2 via display2 ;
}
  
  private int display2() {
	  
	  System.out.println("*********private modifier also acceptable************");
	  
	  
	return 0;
	  
  }
 
}



public class Interfase implements parent,child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Interface is nothing but its a 100 % of achieving way of abstraction 
		// and also interface is doesn't have a method body, once you diclared methods are redefined in the 
		//main method.
		//And then in interface we have to achieve the multiple inheritance without any amiguity
		// Like simply said interface is a set of ruleses.
		
		//The Java compiler adds public and abstract keywords before the interface method. 
		//Moreover, it adds public, static and final keywords before data members.
		
		Interfase s = new Interfase();
		 s.display();
		 s.name();
		 s.name2();
		 s.shape();
		 parent.OrgVal();
		child c = new Interfase();
		
		 System.out.println();
		
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("*****i am re-implemented**********");
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("************ it is also re implemented**********");
		
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("circle");
		
		
		
	}

}
