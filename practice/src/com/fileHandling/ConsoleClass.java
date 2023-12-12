package com.fileHandling;

import java.io.Console;

public class ConsoleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console c = System.console();
		
		System.out.println("Enter the Password :");
		
		String S = c.readLine();
		System.out.println(S);
	
		
		try {
			char [] b = c.readPassword();
		
		String pwd = String.valueOf(b);
		
		System.out.println("The Password is :"+pwd);
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
