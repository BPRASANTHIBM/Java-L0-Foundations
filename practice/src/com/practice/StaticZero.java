package com.practice;

class Base10 {
	
	int a = 1;
	 public void test() {
		 
		 System.out.println("Hello");
	 }
	 
	 private void print() {
		 System.out.println("hi..........");
	 }
	}

	class Base1 extends Base10 {
	
		int b = 2;
		public void test() {
	  System.out.println("Base1");
	 }
		 private void print() {
			 System.out.println("hi..........");
		 }
	}

	class Base2 extends Base1 {
	int c = 3;
		
		public void test() {
	  System.out.println("Base2");
	 }
	}

	public class StaticZero {
	 public static void main(String[] args) {
	  Base10 obj = new Base10();
	  ((Base2) obj).test();// CAST
	  
	  
	  
	  System.out.println(obj.a + ((Base1)obj).b  + ((Base2)obj).c);
	  
	  Base10 obj1 = new Base2();
	  
	  
	 }
	}