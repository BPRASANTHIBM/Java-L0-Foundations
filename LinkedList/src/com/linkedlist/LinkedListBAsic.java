package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBAsic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>list = new LinkedList<Integer>();
		list.add(5);
		list.add(9);
		list.add(5);
		list.addFirst(1);
//		System.out.println(list.getFirst());
		System.out.println(list);
//		System.out.println(list.removeAll(list));
		System.out.println(list);
		
		System.out.println(list.remove(2));
		
		
		
		System.out.println("**************************************************************");
		
		for (int i =0 ; i<list.size();i++) { // way-1
			System.out.println(list.get(i));
		}
		
		for (Integer i : list) { // way-2
			System.out.println(i);
			
		}
		
		Iterator <Integer> it = list.iterator(); //way-3
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
	}

}
