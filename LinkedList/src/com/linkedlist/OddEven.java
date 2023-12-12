package com.linkedlist;

import java.util.LinkedList;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(33);
		list.add(55);
		list.add(99);
		list.add(20);
		System.out.println(list);
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
//		
//		for (Integer i = 0;i<list.size();i++) {
//			Integer t = list.get(i);
//			if(t%2==0) {
//			list1.add(t);
//					
//				}
//			else {
//				list2.add(t);
//			}
//			
//		}	System.out.println(list1);
//		System.out.println(list2);
		
		
			for (Integer i : list) {
				if(i%2==0) {
					list1.add(i);
				}
				else {
					list2.add(i);
				}
			}
			System.out.println(list1);
			System.out.println(list2);
			
			
		
}
}
	

