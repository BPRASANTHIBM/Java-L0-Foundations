package com.SetInterface;

import java.util.HashSet;
import java.util.Scanner;

public class SearchingElementSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>set = new HashSet<Integer> ();
		set.add(5);
		set.add(8);
		set.add(1);
		set.add(11);
		set.add(2);
		set.add(1);
		set.add(0);
		System.out.println(set);
		
		//searching a element 
		System.out.println("Enter the element you want to search  :");
	
		@SuppressWarnings("resource")
		int K = new Scanner(System.in).nextInt();
		
		boolean flag = false;
		
		for (Integer integer : set) {
			
			if(K==integer) {
				flag = true;
				System.out.println("The Element is found in a Set");
				break;
			}
		}
		if(flag==false) {
			System.out.println("The element is not Found");
		}
		
		
		//way -2 
		
		if (set.contains(K))
			System.out.println("The Element is Found");
		else
			System.out.println("The element is not found");
		
	}
	

}
