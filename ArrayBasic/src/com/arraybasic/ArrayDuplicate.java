package com.arraybasic;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {5,8,2,5,2,8};
System.out.println("The Duplicate values are");
for(int i= 0 ;i<arr.length;i++) {
	for(int j =i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			
			
			System.out.print(arr[j]+ " ");
			
		}
	}
	

	System.out.println();
}
	}
}


