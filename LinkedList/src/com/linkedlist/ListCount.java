package com.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class ListCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
LinkedList<Integer> list = new LinkedList<Integer>();
list.add(33);
list.add(55);
list.add(99);
list.add(20);
list.add(33);
list.add(20);
System.out.println("Enter the value you goanna be count ");

int c = sc.nextInt();
int count=0;
for (int i=0;i<list.size();i++) {
	int t = list.get(i);
	if(t==c) {
		count ++;
	}
	
	
}System.out.println(" The value of you enter" +c+ "is in list presented in"+count +"Times");
	}

}
