package com.practice;

import java.util.Scanner;
import java.util.regex.*;
public class PasswordGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

  

System.out.println("Enter the vaild Password the password must containIt contains at least 8 characters and at most 20 characters.\r\n"
		+ "\nIt contains at least one digit.\r\n"
		+ "\nIt contains at least one upper case alphabet.\r\n"
		+ "\nIt contains at least one lower case alphabet.\r\n"
		+ "\nIt contains at least one special character which includes !@#$%&*()-+=^.\r\n"
		+ "\nIt doesn’t contain any white space.");

String pass = sc.nextLine();

System.out.println("\n--------------------------------------------------------");

String reg = "^(?=.*[0-9])"
        + "(?=.*[a-z])(?=.*[A-Z])"
        + "(?=.*[@#$%^&+=])"
        + "(?=\\S+$).{8,20}$";
// ^ rep Starting of the string
//?=.*[0-9] must contain atleast once
// same as (?=.*[]) using syndax all atleast contain one time
//(?=\\S+$) cannot accept whitespace
//{8-20} char must insert
Pattern pattern = Pattern.compile(reg); // pattern pass

if(pass==null) {
System.out.println("<---------------Enter the value---------------->");
}
 Matcher m = pattern.matcher(pass); // match the password

 boolean match = m.find();
  
 
 if (match == true) {
	 
	 System.out.println("<-----Your Has been Valid----->"+"\n your Password is :");
	 System.out.println(pass);
	 
	 
	 
 }
 else
	 System.out.println("Enter the Right and Vaild Password");
 
}
	}

