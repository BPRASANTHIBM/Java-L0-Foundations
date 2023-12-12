package com.arraybasic;

import java.util.Arrays;

public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= { 5,8,9,11,55};
int position = 3;
int newvalue =98 ;

for(int i=arr.length-1;i>position;i--) {
	 arr[i] = arr[i-1];
}

arr [position] = newvalue;


System.out.println("New Array: " + Arrays.toString(arr));

	}

}

