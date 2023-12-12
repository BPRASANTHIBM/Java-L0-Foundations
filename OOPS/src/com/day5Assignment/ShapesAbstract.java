package com.day5Assignment;

abstract class Shapes{
	
	abstract double calculateArea();
	abstract double calculatePerimeter();
	
}

class Circle extends Shapes{
	int r = 3;
	@Override
	double calculateArea() {
		
		
		
		
		double  a = Math.PI*r*r;
		
		
		return a;
		
	}

	@Override
	double calculatePerimeter() {
		
   double c = 2 * Math.PI* r;
		
		return c;   
	}
	
	
}

class Triangle extends Shapes{

	int b = 10;
	int s1 = 2;
	int s2 = 4;
	
	@Override
	double calculateArea() {
	
        int h = 12;
		
		double a = (b*h)/2;
		return a; 
	}

	@Override
	double calculatePerimeter() {
		

		double c = s1+b+s2;
		
		return c;
	}
	
	
	
}

public class ShapesAbstract {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		Triangle t = new Triangle();
		
		System.out.println("The Circle Area is :"+c.calculateArea());
		System.out.println("The Circle Perimeter is :"+c.calculatePerimeter());
		
		System.out.println("***************************************************");
		
		System.out.println("The Triangle Area is : "+t.calculateArea());
		System.out.println("The Triangle Perimeter is : "+t.calculatePerimeter());
		

	}

}
