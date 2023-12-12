package com.arraybasic;
import java.util.*;
public class ArrayLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,20,30,40,50};
int k =0;
boolean flag= false;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Search element");
k = sc.nextInt();
for (int i=0 ; i<arr.length;i++) {
	if(k==arr[i]) {
		System.out.println("Element is found in the array" + k);
		flag = true;
	}
	
}
	
	if(flag == false) {
		System.out.println("Element is not found in the array");
		
	}
	}

	}


