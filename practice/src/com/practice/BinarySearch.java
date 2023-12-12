package com.practice;

import java.util.Stack;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr []= {3,9,5,2,8,9};
int s = 5;
int l1 = 0;
int h1 = arr.length-1;
BinarySearch b = new BinarySearch();
int result = b.display(arr,s,l1,h1);
if (result==0) {
	System.out.println("the element is  not found");
}
else {
	System.out.println("the element is found");
}
	}

	public int display(int[] arr, int k, int l, int h) {
		// TODO Auto-generated method stub
		while (l<=h) {
			int m= h+l/2;
			if(arr[m]==k) {
				return 1;
			}
	
			if (arr[m]<k) {
				l= m+1;
			}
			else
			  {
				h= m-1;
			}
		}return 0;
	}

	

	
}

