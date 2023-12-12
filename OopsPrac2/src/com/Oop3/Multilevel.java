package com.Oop3;



class GrandParent{
	void display() {
		int pen = 2;
		int paper = 5 ;
		
		System.out.println(" i am Grand Parent");
	}
}
class parent extends GrandParent{
	
	void display1(){
		int Scale = 8;
		System.out.println("I am a Parent");
	}
}

class child extends parent{
	void display3() {
		

		System.out.println("I am a Child");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child c = new child();
		
		c.display1();
		c.display();
		c.display3();
		
		

	}

}
