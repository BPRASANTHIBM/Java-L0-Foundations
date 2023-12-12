package com.fileHandling;

import java.util.Scanner;

public class CrudFileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Enter the option you want ????\n1.Create a file \n2.write a file"
				+ "\n3.search the element \n4.count the words in a file \n5.delete the file");
		
		Scanner sc = new Scanner (System.in);
		
		CrudFileHandling ch = new CrudFileHandling();
		
		
	
		
		
		int n = sc.nextInt();
	switch (n) {
	case 1:
		
		ch.create();
		
		break;
		
    case 2:
		
		ch.write();
		
		break;
     case 3:
		
		ch.search();
		
		break;
		
     case 4:
 		
 		ch.counting();
 		
 		break;
     case 5:
    	 ch.delete();




	
	}
		
	}

	private void delete() {
		// TODO Auto-generated method stub
		
		
		
	}

	private void counting() {
		// TODO Auto-generated method stub
		
	}

	private void search() {
		// TODO Auto-generated method stub
		
	}

	private void write() {
		// TODO Auto-generated method stub
		
	}

	private void create() {
		
		
	}

}
