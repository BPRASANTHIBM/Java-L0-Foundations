package com.linkedlist;

import java.util.*;


public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc = new Scanner (System.in);
		System.out.println(" enter the elements");
		
		for (Integer i : arr) {
			
		       arr.add(i);
		       
		       System.out.println(arr);
		}
		
		
		System.out.println("Enter the search element you want :");
		
		int k = sc.nextInt();
		
		boolean flag = false;
		
		for(int i=0;i<arr.size();i++) {
			
			if(k==arr.get(i)) {
				
				flag = true;
				
				System.out.println("The element is found in the list");
				break;
				
			}
		}
		
		if(flag==false) {
			
			System.out.println("The element is not found in the arraylist");
		}
		
		
	}

}
