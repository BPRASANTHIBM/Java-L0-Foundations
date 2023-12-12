package com.arraybasic;

public class ArrayContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {2,9,4,6,7};
int key = 4;
boolean flag = false;
for(int i=0; i<arr.length;i++) {
	if(arr[i]==key) {
		System.out.println("The value is Found in the Array :"+key);
		flag = true;
	break;
	}
}
	if(flag==false) {
		System.out.println("The value is not found in a array");
	}

	}

}
