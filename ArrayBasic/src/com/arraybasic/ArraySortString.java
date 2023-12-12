package com.arraybasic;

import java.util.Arrays;

public class ArraySortString {
public static void main(String[]args) {
	String arr []= {"bannana","apple","orange"};
	String temp="";
	for(int i= 0 ;i<arr.length;i++) {
		for(int j =i+1;j<arr.length;j++) {
			if(arr[i].compareTo(arr[j])>0) {
				temp = arr[i];
				arr[i]= arr[j];
				arr[j]=temp;
				
			}
		}
		
	}
	Arrays.sort(arr);
	for (String i : arr) {
		System.out.print(i+" ");
		
}
}
}
