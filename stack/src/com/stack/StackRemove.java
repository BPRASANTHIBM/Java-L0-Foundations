package com.stack;

import java.util.Stack;

public class StackRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> stack = new Stack<Integer>();

stack.push(11);
stack.push(1);
stack.push(99);
stack.push(6);
stack.push(3);
stack.push(51);
System.out.println(stack);


while(stack.removeAll(stack)==true) {
	System.out.println("stack removed all elements");
}
System.out.println(stack);
	}

}
