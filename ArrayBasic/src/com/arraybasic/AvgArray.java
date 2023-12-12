package com.arraybasic;

public class AvgArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr []= {7,8,9,2,4};
int sum=0 ;
float Avg=0;
for(int i=0;i<arr.length;i++) {
	sum= sum + arr[i];
	 
}
Avg = sum/arr.length;
System.out.println("The Average Value of Array is :"+Avg);


	}

}
