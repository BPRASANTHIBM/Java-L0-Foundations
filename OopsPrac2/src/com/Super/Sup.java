package com.Super;

 public class Sup{
	 
public static void main(String []args) {
		son s = new son();
		s.display();
	
	
	 }
	
	}
	
	

 class child  {
	 public void display() {
		 System.out.println("I am the child");
	 }
 }
 
class son extends child{
	 public void display() {
	
		 System.out.println("I am the son");
		 
	 }
 }
 
 
 
 