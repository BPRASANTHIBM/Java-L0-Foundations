package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> list = new LinkedList<Integer>();
list.add(33);
list.add(55);
list.add(99);
list.add(20);
System.out.println(list);
LinkedList<Integer> reverselist = new LinkedList<Integer>();

for (int i=list.size()-1;i>=0;i--) {//way - 1
	Integer t = list.get(i);
	 reverselist.add(t);
}System.out.println(reverselist);
 
Iterator<Integer> it = list.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}



	}

}
