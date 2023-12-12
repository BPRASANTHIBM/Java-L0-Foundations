package com.queue;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeueBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> queue = new LinkedList<Integer>();
		queue.offer(5);
		queue.offer(2);
		queue.offer(1);
		queue.offer(5);
		queue.add(3);
		queue.add(7);
		
		
		System.out.println(queue);
		System.out.println("_______________________________________________________");
		Deque<Integer> queue1 = new LinkedList<Integer>();
		Collections.asLifoQueue(queue1);
		queue1.offer(5);
		queue1.offer(2);
		queue1.offer(1);
		queue1.offer(5);
		queue1.add(3);
		queue1.add(7);
		
		
		System.out.println(queue1);
		
		
		
		
		queue.offerFirst(5);
		queue.offerLast(3);
		System.out.println(queue);
		System.out.println("-----------------------------------");
		queue.pollFirst();
		queue.pollLast();
		System.out.println(queue);
		
		System.out.println(queue.peekFirst());
		System.out.println(queue.peekLast());
		System.out.println(queue.pop());
		queue.push(9);
		System.out.println(queue);
	}

}
