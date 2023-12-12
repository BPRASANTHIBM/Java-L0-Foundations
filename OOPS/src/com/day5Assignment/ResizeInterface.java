package com.day5Assignment;

interface Resizable{
	
	int resizeWidth(int width);
	int resizeHeigth(int height);
	
}

class Rectangle implements Resizable{

	@Override
	public int resizeWidth(int width) {
		
		
		return width;
	}

	@Override
	public int resizeHeigth(int height) {
		
		return height;
	}
	
	
}

public class ResizeInterface {

	public static void main(String[] args) {
		

		Resizable r = new Rectangle() ;
		
		System.out.println("The Rectangle resize width is :"+r.resizeHeigth(5)+" cm");
		
		System.out.println("The Rectangle resize heigth is : "+r.resizeHeigth(8)+" cm");
	}

}
