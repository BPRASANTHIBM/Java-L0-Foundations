package com.queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SingleQueue {

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


queue.poll();
System.out.println(queue);

queue.remove();


for (Integer i : queue) {
	System.out.println(i);
	
}
System.out.println("-----------------------------------------------------------");

Iterator<Integer> it = queue.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

System.out.println("------------------------------------------------------------");


for(;queue.size()>0;) {
	System.out.print(queue.poll()+" ");
}
	}

}
