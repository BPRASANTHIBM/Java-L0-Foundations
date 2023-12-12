package com.arraybasic;

import java.util.Scanner;

public class ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = new int[5];
System.out.println("enter the 5 values :");
Scanner sc = new Scanner(System.in);
for(int i=0; i<arr.length;i++) {
	arr[i]=sc.nextInt();
}


System.out.println("Array elements are :");
for(int i=0; i<arr.length;i++) {
	System.out.println(arr[i]);
}

//int arr2 = new int[] {1,2,3,4,5};
int arr1[]= {10,20,30,40,50};
System.out.println("Array elements are :");
for (int i : arr1) {
	System.out.println(i);	
}

//int x = 5;
	}

}
