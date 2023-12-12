package com.Bubble;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {5, 7, 11, 3, 1, 9};
		
		Scanner sc = new Scanner (System.in);
		
		int k = sc.nextInt();
		
		for (int i = 0 ; i<arr.length ; i++) {
			
			for(int j = i+1 ; j<arr.length ; j++){
				int temp = arr[i];
				
				arr[i] = arr[j];
				
				
				arr[i] = temp ;
				
				
			}
		}
		
		for (int i : arr) {
			
			
			System.out.println(i+" ");
			
			
		}
		
		
	}

}
