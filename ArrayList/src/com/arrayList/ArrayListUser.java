package com.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
ArrayList<Integer>list= new ArrayList<Integer>();
System.out.println("Enter the elements can stored in the array :");

int n = sc.nextInt();
System.out.println("enter"+n+"elements");
for(int i=0; i<n;i++) {
	//int t = sc.nextInt();
	list.add(sc.nextInt());// without using temp
}
System.out.println(list);

	}

}
