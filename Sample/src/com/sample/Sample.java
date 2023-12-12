package com.sample;
import java.util.*;
public class Sample {

	public int display (int a)
	{
		// TODO Auto-generated method stub
// keyboard input 
Scanner sc = new Scanner (System.in);
System.out.println("Enter the value");
//int a = sc.nextInt();
//System.out.println("the before process value is"+ a);
	
// array initialization
	int arr[] = {1, 2, 3, 4};
	int arr1[] = new int[a];
	for(int i=0 ; i<a ;i++) {
		arr1 [i]=sc.nextInt();
	}
	for(int r:arr1) {
		System.out.println(r);
	}
	return 0;
	}
}
