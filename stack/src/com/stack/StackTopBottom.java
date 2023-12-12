package com.stack;

import java.util.Stack;

public class StackTopBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(23);
		stack.push(46);
		stack.push(46);
		stack.push(46);
		stack.push(46);
		stack.push(1);
		stack.push(2);
		stack.add(5);
		stack.add(2);
		System.out.println(stack);
		System.out.println("The top of the element is"+stack.peek());
		System.out.println("The Bottom of the element is "+ stack.get(0));
	}

}
