package com.stack;

import java.util.Stack;

public class StackSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(23);
		stack.push(46);
		stack.push(1);
		stack.push(2);
		stack.add(5);
		System.out.println(stack);
		int s = 2;
		boolean flag = false;
		System.out.println(stack.search(5));
		for(int i=0;i<stack.size();i++) {
			if(s==stack.get(i)) {
				System.out.println(s+" is Present in the stack");
				flag = true;
			}
			

			
		}
		if(flag==false) {
			System.out.println(s+"the element is not found");
		}
		
	}
}
		




