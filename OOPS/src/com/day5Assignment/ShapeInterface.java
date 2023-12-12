package com.day5Assignment;

interface Shape${
	
	abstract double getArea();
	
	
	
}

class Circle$ implements Shape${

	@Override
	public double getArea() {
		int r = 3;
		
			
			
			
			double  a = Math.PI*r*r;
			
			
			return a;
	}
	
	
}
class Triangle$ implements Shape${

	@Override
	public double getArea() {
		int b = 10;
	
	
			
			
			
			int h = 12;
			
			double a = (b*h)/2;
			return a;
		}
	}
	
	


class Rectangle$ implements Shape${

	
	int w = 20;
	int l = 10;
	@Override
	public double getArea() {
	
		
		double a = w * l;
		return a;
		
	}	
	
}

public class ShapeInterface{
	
	public static void main (String []args) {
		Circle$ c = new Circle$();
		
		Triangle$ t = new Triangle$();
		Rectangle$ r = new Rectangle$();
		
		System.out.println("The Circle Area is : "+c.getArea());
		System.out.println("The Triangle area is :"+t.getArea());
		System.out.println("The Rectangle Area is :"+r.getArea());
		
		
	}
}

