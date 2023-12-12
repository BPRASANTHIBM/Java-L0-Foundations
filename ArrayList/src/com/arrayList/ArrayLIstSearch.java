package com.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLIstSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner  sc = new Scanner (System.in);
boolean flag = false ;
System.out.println("Enter the element to search");
int k = sc.nextInt();
ArrayList<Integer>list = new ArrayList<Integer>();
list.add(10);
list.add(40);
list.add(11);
list.add(13);
list.add(1);
System.out.println(list);
System.out.println();

for (int i=0;i<list.size();i++) {

	if(k==list.get(i)) {
		flag = true;
		System.out.println("The Element is Found In the ArrayList");
	}
	
}if (flag == false) {
	System.out.println("The Element is not found in the array");
}
	}

}
