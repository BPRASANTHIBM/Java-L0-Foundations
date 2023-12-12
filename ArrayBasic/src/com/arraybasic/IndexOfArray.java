package com.arraybasic;

public class IndexOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,7,4,6,11};
int key = 7;
boolean flag = false;
for(int i=0; i<arr.length;i++) {
	if(arr[i]==key) {
		System.out.println("The value is Found in the Array :"+key);
		System.out.println("The Index Value Of Array is :"+i);
		flag = true;
	break;
	}
}
	if(flag==false) {
		System.out.println("The value is not found in a array");
	}

	}

}
