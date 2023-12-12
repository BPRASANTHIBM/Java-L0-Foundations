package com.SetInterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>set = new TreeSet<Integer> ();
		set.add(5);
		set.add(8);
		set.add(1);
		set.add(11);
		set.add(2);
		set.add(1);
		set.add(0);
		System.out.println(set);
		
		
		
		
	//	System.out.println(set.ceiling(4));
		
		System.out.println("Enter the value of search element :");
		
		@SuppressWarnings("resource")
		int s = new Scanner(System.in).nextInt();
		boolean flag= false;
		
		for (Integer i : set) {
			if(s==i) {
				
				flag= true;
				System.out.println("The Element is Found");
				break;
				
			}
			
		}
		if (flag==false) {
			System.out.println("The element not found");
		}
		
		if(set.contains(s)) {
			System.out.println("element is found");
		}
		else
			System.out.println("Element is not found");
	}

}
