package com.day4Assignment;


class Shape3 {
public double getArea() {
		  
	int a = 0;
		
		
		
		return a;

	
}
}

class circles extends Shape3 {
	int r = 3;
	public double getArea() {
		 
		
		
		
		double  a = Math.PI*r*r;
		
		
		return a;
		
		
		
		
	}
	
	public double getPerimeter() {
		
		double c = 2 * Math.PI* r;
		
		return c;
	}
	
	
}

class Rectangles extends circles {
	int w = 20;
	int l = 10;
	public double getArea() {
	
		
		double a = w * l;
		return a;
		
	}
	
	
public double getPerimeter() {
		
		double c = 2*(l+w);
		
		return c;
	}
}

class Triangles extends Rectangles {
	int b = 10;
	int s1 = 2;
	int s2 = 4;
	public double getArea() {
		
		
		
		int h = 12;
		
		double a = (b*h)/2;
		return a;
	}
	

	
public double getPerimeter() {
		
		double c = s1+b+s2;
		
		return c;
	}
	
}


public class Shape2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		circles s = new circles();
		
		Rectangles R = new Rectangles();
		
		
		Triangles T = new Triangles ();
		
		System.out.println("Circles Area and Perimeter is :"+ s.getArea()+" & "+s.getPerimeter());
		
		System.out.println("Rectangles Area and Perimeter is :"+ R.getArea()+" & "+R.getPerimeter());
		
		System.out.println("Triangles Area and Perimeter is :"+ T.getArea()+" & "+T.getPerimeter());
	}

}
