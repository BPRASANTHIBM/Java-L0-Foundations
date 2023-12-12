package com.practice;

   class Deep {
	
	Deep (){ //1
		
		System.out.println("1");
	}
	
	Deep(int d){
		System.out.println(d+"h");//1
	}
	
}

   
   class dip extends Deep{
	   
	   dip(int d){ // child constructor
		   
		   System.out.println(d+"1");// 2 2
	   }
   }
   
   
   class Base {
	    public Base() {
	        System.out.print("Base ");
	    }

	    public Base(String s) {
	        System.out.print("Base: " + s);//2 3 3
	    }
	}

	class Derived extends Base {
	    public Derived(String s) {
	       // super(); // Stmt-1
	     //   super(s); // Stmt-2
	        System.out.print(s+"Derived ");//3 4 4
	    }
	}

public  class ConPre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deep d = new dip(3);

Base b = new Derived("hello");

		
		
	}

}
