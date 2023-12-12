package com.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCrud {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner  sc = new Scanner (System.in);
	
	
	ArrayList<Integer>list = new ArrayList<Integer>();
	list.add(10);
	list.add(40);
	list.add(11);
	list.add(13);
	list.add(1);
	boolean dec = true;
	while(dec) {
	System.out.println("Enter your choise \n1.Add \n2.Search \n3.Remove \n4.Update \n5.View \n6.Quit");
	int option = sc.nextInt();
	
	
	 switch (option) {
	case 1: {
		System.out.println("Enter the Element you can Add");
		list.add(sc.nextInt());
		System.out.println("The Element is Added");
		break;
	}
	
	
	
	case 2:{
		System.out.println("Enter the Element you can Search");
		int n = sc.nextInt();
		boolean flag = false;
		
		
		for (int i=0;i<list.size();i++) {

			if(n==list.get(i)) {
				flag = true;
				System.out.println("The Element is Found In the ArrayList");
			}
			
		}if (flag == false) {
			System.out.println("The Element is not found in the array");
		}
	}
	break;
	
	case 3:{
		boolean flag = false;
		System.out.println("Enter the element you can delete");
		int n1 = sc.nextInt();
		for (int i=0;i<list.size();i++) {

			if(n1==list.get(i)) {
				flag = true;
				list.remove(i);
				System.out.println("The Element is Found and Removed");
			}
			
		}if (flag == false) {
			System.out.println("The Element is not found in the array");
		}
	}
	break;
	case 4:{
		System.out.println("Enter the Update the value");
		int n2 = sc.nextInt();
		list.set(n2, 0);
		System.out.println("The value is Updated");
		break;
	}
	
	case 5:{
		System.out.println(list);
		System.out.println("The Element Viewed");
		}break;
	
	case 6:{
		
		//System.exit(option);
		dec = false;

	break;	}//break;
	default:{
		System.out.println("Invalid Value");
		
	}
	
	}
	 System.out.println("Do you want to continue of loop y/n");
		String tem = sc.next();
		if(tem.compareTo("n")==0) {
			dec=false;
			
		}
	
	}}
	
		} 
		
	
	 
	
		

		


