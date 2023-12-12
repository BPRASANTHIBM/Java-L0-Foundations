package com.practice;

import java.util.Collection;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<Integer> q = new PriorityQueue<>() ;
//Queue<Integer> q = new Queue<Integer>() ;

//Collection<Integer>= new Collection<>();
q.add(5);
q.offer(9);
q.add(10);
q.add(1);
q.add(101);
q.add(0);
System.out.println(q);
//System.out.println(q.poll());
//System.out.println(q);
//System.out.println(q.element());
//System.out.println(q.remove());


	}

}
