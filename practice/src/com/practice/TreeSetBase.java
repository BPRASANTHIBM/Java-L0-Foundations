package com.practice;
import java.util.*;
import java.util.TreeSet;

public class TreeSetBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> tree = new TreeSet<Integer> ();
		
		tree.add(5);
		tree.add(10);
		tree.add(9);
		tree.add(10);
		tree.add(1);
		 System.out.println(tree);
		 
		System.out.println( tree.ceiling(5));
		System.out.println(tree.floor(8));
//		Iterator <Integer>it = tree.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//			
//		}
		
		
		Iterator <Integer>it = tree.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		System.out.println("--------------------------------------------");
		
		for (Integer integer : tree) {
			System.out.println(integer);
			
		}
		
		
	}

}
