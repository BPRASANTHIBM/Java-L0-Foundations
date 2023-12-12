package com.stack;

import java.util.Stack;

public class StackTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(23);
		stack.push(46);
		stack.push(1);
		stack.push(2);
		System.out.println(stack);
		while(stack.size()!=0){
//		while(!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}
	}

}
