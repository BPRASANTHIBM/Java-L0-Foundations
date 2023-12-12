package com.day4Assignment;

class Shape {
public double calculateArea() {
		  
	int a = 0;
		
		
		
		return a;

	
}
}

class circle extends Shape {
	
	public double calculateArea() {
		 
		
		int r = 3;
		
		double  a = Math.PI*r*r;
		
		
		return a;
		
		
		
		
	}
	
	
}

class Rectangle extends circle {
	
	public double calculateArea() {
		int w = 20;
		int l = 10;
		
		double a = w * l;
		return a;
		
	}
}

class Triangle extends Rectangle {
	
	public double calculateArea() {
		
		int b = 10;
		
		int h = 12;
		
		double a = (b*h)/2;
		return a;
	}
	
}



public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Circles area :"+ new circle().calculateArea());
		
		System.out.println("Rectangle area :"+ new Rectangle().calculateArea());
		
		System.out.println("Triangle area :"+ new Triangle().calculateArea());
		
		
	}

}
