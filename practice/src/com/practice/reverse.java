package com.practice;

import java.util.Arrays;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = {3, 7, 9, 1, 5, 2};  // O(1) function
		
		for(int i =0; i<arr.length; i++) {
			
			for(int j = arr.length-1; i<0 ; i--) {
				
				arr [j] = arr[0];
				
			}
			
			
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		
	}

}
