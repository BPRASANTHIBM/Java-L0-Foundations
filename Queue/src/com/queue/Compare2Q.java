package com.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Compare2Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String>queue = new PriorityQueue<>();
		Queue<String>queue1 = new PriorityQueue<>();
		queue.offer("red");
		queue.offer("blue");
		queue.offer("yellow");
		queue.offer("green");
		queue.offer("Black");
		System.out.println(queue);
		queue1.offer("red");
		queue1.offer("blue");
		queue1.offer("purpule");
		queue1.offer("vilote");
		queue1.offer("Saffron");
//		LinkedList <String>list = new LinkedList();
//		LinkedList <String>list1 = new LinkedList();
//		if(list.contains(list1))
//		
		
		
		Iterator<String> it = queue.iterator();
		Iterator<String> it1 = queue1.iterator();
//		while(it.hasNext()&&it1.hasNext()) {
//			String s= it.next();
//			String s1= it1.next();
//		if(s==s1) {
//				System.out.println("The Queue of same value is :"+s);
//			}
//////			
//////			
//////		}
////	
		
	
		int count =0;
		for (String s : queue) {
			for (String s2 : queue1) {
				if(s2.contains(s)) {
					System.out.println("The mached element is :" +s2);
					count ++;
				}
				
			}
		}
		
		if(count==queue.size()) {
			System.out.println("The queue size is same");
		}
		else
			System.out.println("The queue size is differ");
	}

}
