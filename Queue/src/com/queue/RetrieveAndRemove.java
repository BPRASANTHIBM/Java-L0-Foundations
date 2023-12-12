package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class RetrieveAndRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String>queue = new PriorityQueue<>();
		queue.offer("red");
		queue.offer("blue");
		queue.offer("yellow");
		queue.offer("green");
		queue.offer("Black");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}
