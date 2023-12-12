package com.ds;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
	
		Queue <Integer>queue = new LinkedList<Integer>();
		
		queue.add(10);
		queue.add(11);
		queue.add(6);
		queue.add(9);
		queue.add(20);
		
		Scanner sc = new Scanner (System.in); // get the data from user using Scanner Class
		
		System.out.println("Enter the Element you want to Search : ");
		
		int search = sc.nextInt();
		
		boolean flag = false; 
		
		for (Integer integer : queue) {
			
			if(integer.equals(search)) {
				
				System.out.println("The search element"+search+" is available in this queue");
				flag = true;
				
			}
			
			
		}
		if(flag==false) {
			
			System.out.println("The searching Element "+search+" is not available in this queue");
		}
		
		

	}

}
