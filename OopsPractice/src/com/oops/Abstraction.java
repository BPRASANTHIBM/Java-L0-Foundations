package com.oops;

import java.util.Scanner;



abstract class Main {

	private String s;

	Main(String s) { // Constructor
		this.s = s;
		System.out.println(s);
	}

	abstract int rent(); // Abstract Methods Once Diclear the method you have to redefine main method

	abstract String HouseOwnerName();

	abstract Integer Address();

}

public class Abstraction extends Main {

	Abstraction(String s) {
		super(s); // send the string to parent class 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Abstraction is nothing but it showing only the essential properties to the
		// user
		// like A car can view only rather than which individual componant
		// abstract class can contain the constructors, static and non static methods
		// To achieve a full abstration to use interface concept

		// Hiding internal details and showing functionality is known as abstraction.
		// For example phone call, we don't know the internal processing.
		
		System.out.println("enter the string ");
		
		String s = new Scanner(System.in).next();
		
		Main m = new Abstraction(s);

	}

	@Override
	int rent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String HouseOwnerName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Integer Address() {
		// TODO Auto-generated method stub
		return null;
	}

}
