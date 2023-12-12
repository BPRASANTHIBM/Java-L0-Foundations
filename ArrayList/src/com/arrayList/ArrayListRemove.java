package com.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRemove {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner  sc = new Scanner (System.in);
boolean flag = false ;
System.out.println("Enter the element to Remove");
int k = sc.nextInt();
ArrayList<Integer>list = new ArrayList<Integer>();
list.add(10);
list.add(40);
list.add(11);
list.add(13);
list.add(1);
System.out.println("The Original Array is :");
System.out.println(list);
System.out.println();

for (int i=0;i<list.size();i++) {

	if(k==list.get(i)) {
		flag = true;
		list.remove(i);
		System.out.println("The Element is Found and Removed");
	}
	
}if (flag == false) {
	System.out.println("The Element is not found in the array");
}
System.out.println(list);
	}

}
