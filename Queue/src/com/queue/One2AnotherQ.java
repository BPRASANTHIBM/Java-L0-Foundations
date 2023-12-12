package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class One2AnotherQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String>queue = new PriorityQueue<>();
		queue.offer("red");
		queue.offer("blue");
		queue.offer("yellow");
		queue.offer("green");
		queue.offer("Black");
		System.out.println(queue);
		Queue<String>queue1 = new PriorityQueue<>();

Iterator<String> it = queue.iterator();
while(it.hasNext()) {
	String s = it.next();
	queue1.offer(s);
}
System.out.println(queue1);
		
	}

}
