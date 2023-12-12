package com.stack;

import java.util.Stack;

public class StackDuplicate {

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
		for(int i=0;i<stack.size();i++) {
			int k = stack.get(i);
			for(int j = i +1 ; j<stack.size();j++) {
				if (k==stack.get(j)) {
					stack.remove(j);
				}
			}
		}
		System.out.println(stack);
	}
	

}
