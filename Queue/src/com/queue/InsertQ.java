package com.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class InsertQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String>queue = new ArrayDeque<>();
		queue.offer("red");
		queue.offer("blue");
		queue.offer("yellow");
		queue.offer("green");
		queue.offer("Black");
		queue.add("purple");
		
		
		System.out.println(queue);
	}

}
