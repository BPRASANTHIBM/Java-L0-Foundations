package com.stack;

import java.util.Stack;

public class StackCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(23);
		stack.push(46);
		stack.push(1);
		stack.push(2);
		stack.add(5);
		
		System.out.println(stack);
		int count =0;
		while(!stack.isEmpty()) {
			stack.pop();
			count ++;
		}
		
		System.out.println(count);
	}

}
