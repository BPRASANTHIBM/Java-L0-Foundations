package com.queue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String>queue = new PriorityQueue<>();
		queue.offer("red");
		queue.offer("blue");
		queue.offer("yellow");
		queue.offer("green");
		queue.offer("Black");
		System.out.println(queue);
		
		Object arr[] = queue.toArray();
		
	
	Arrays.sort(arr);
		for (Object object : arr) {
			System.out.println(object);
		}
		
	}

}
