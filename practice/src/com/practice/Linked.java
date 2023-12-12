package com.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		boolean dec = true ;
while(dec){
	LinkedList<Integer>list = new LinkedList<Integer>();
list.add(5);
list.add(9);
list.add(5);
list.addFirst(1);
System.out.println(list.getFirst());
System.out.println(list);
System.out.println(list.removeAll(list));
System.out.println(list);


System.out.println("Do you have continue the operation \n1.yes|\n2.no");
String S = sc.nextLine();
if(S.compareTo("no")==0 ){
	dec= false;
}
}


}

	}


