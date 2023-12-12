package com.queue;

import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(33);
		list.add(55);
		list.add(99);
		list.add(20);
		list.add(33);
		list.add(20);
//		Collections.sort(list); - using list to sort the list elements

		System.out.println(list);
//		Collections.reverse(list); - using list to reverse
		System.out.println(list);
		System.out.println("----------------------------------------");
Queue<Integer> queue= new PriorityQueue<Integer>();// Collection.reverseOrder() - using value on Desending order
queue.offer(9);
System.out.println(queue);
queue.offer(5);
System.out.println(queue);
queue.offer(2);
queue.offer(1);
queue.offer(5);
queue.add(3);
System.out.println(queue);
queue.add(7);
System.out.println("------------------------------------------------");
queue.poll();
System.out.println(queue);
queue.remove();
System.out.println(queue);


System.out.println("------------------------------");
Deque<Integer> queue1 = new LinkedList<>();
queue1.add(5);
queue1.add(8);
Collections.asLifoQueue(queue1);
System.out.println(queue1.remove());


	}

}
