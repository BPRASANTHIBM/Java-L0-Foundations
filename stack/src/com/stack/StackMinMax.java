package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class StackMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
//		Scanner sc = new Scanner(System.in);
//		int k = sc.nextInt();
		
		stack.push(23);
		stack.push(46);
		stack.push(1);
		stack.push(2);
		System.out.println(stack);
		Stack<Integer>temp = new Stack <Integer>();
		while(!stack.isEmpty()){
			int t = stack.pop();
			while(!temp.isEmpty()&&temp.peek()<t) {
				stack.push(temp.pop());
			}
			temp.push(t);
			
		}
		System.out.println(temp);
		
		System.out.println("The Max value of stack is "+temp.get(0));
		System.out.println("The Min value of stack is "+temp.peek());
		
	}

}
