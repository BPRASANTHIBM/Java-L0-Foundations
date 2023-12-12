package com.Oop2;
//Hiererical nothing but one or more child inherits parent



class Parent{
	void a() {
		System.out.println("Animal");
	}
}
class child1 extends Parent{
	void b() {
		System.out.println("Animal's 1st Son");
	}
	
	
}

class child2 extends Parent{
	void c() {
		System.out.println(" Animal's 1st Daughter");
	}
}





public class Hiererichal {

	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
child2 c = new child2();
child1 c1 = new child1();

c.c();
c.a();
		
	
		
	}

}
