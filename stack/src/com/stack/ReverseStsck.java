package com.stack;

import java.util.Stack;

public class ReverseStsck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Stack<Integer> stack = new Stack<Integer>();
				Stack<Integer> stack1 = new Stack<Integer>();
				stack.push(23);
				stack.push(46);
				stack.push(1);
				stack.push(2);
				System.out.println(stack.elementAt(0));
				System.out.println(stack);
//				for (Integer integer : stack1) {
//					System.out.println(stack1);
//				}
for (int i = 0; i < stack.size(); i++) {
	System.out.println(stack.get(i));
}

for (int i = stack.size()-1; i >0; i--) {
	System.out.println(stack.get(i));
}

				while(!stack.isEmpty()) {
					stack1.push(stack.peek());
					stack.pop();
				}System.out.println(stack1);
	}

}
