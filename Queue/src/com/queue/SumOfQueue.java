package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(5);
		queue.offer(2);
		queue.offer(1);
		queue.offer(5);
		queue.add(3);
		queue.add(7);
		System.out.println(queue);
		
		int sum = 0;
		for(;queue.size()>0;) {

			 sum = sum + queue.poll();
			 
			 
		} System.out.println(sum);
	}

}
