package com.stack;

import java.util.Stack;

public class stackbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> stack = new Stack<Integer>();
stack.push(23);
stack.push(46);
stack.push(1);
stack.push(2);
System.out.println(stack);
stack.pop();
System.out.println(stack.pop());
System.out.println(stack);
System.out.println(stack.peek());
stack.clear();
System.out.println("--------------------------------------------------");
System.out.println(stack);




	}

}


