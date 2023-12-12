package com.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class QueueBigsmall {

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
		Deque<Integer> temp = new ArrayDeque<Integer>();
		while(!queue.isEmpty()){
			int t = queue.pop();
			while(!temp.isEmpty()&&temp.peek()<t) {
				queue.push(temp.pop());
			}
			temp.push(t);
			
			
	}System.out.println(temp);
	
   Object arr[] = temp.toArray();
   //Arrays.sort(arr);- Sort the arr in pre defined function 
	
	System.out.println("The Second min value is "+arr[1]);

	System.out.println("The Second max value is"+ arr[ arr.length-1]);

	}
}
