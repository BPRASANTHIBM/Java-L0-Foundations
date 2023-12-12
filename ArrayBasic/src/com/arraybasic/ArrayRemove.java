package com.arraybasic;

public class ArrayRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,9,4,6,7};
		int key = 4;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==key) {
				 arr[i]=0;
			break;
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}	

	}

}
