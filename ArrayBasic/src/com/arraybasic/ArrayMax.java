package com.arraybasic;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {54,23,11,8,10};//Using Selection Sort Method
		int temp;
		for(int i= 0 ;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		System.out.println("The Max value of array :"+arr[arr.length-1]);
	}

}
