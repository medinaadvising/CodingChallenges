package com.revature;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stacked {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		int max = 0;
		
		stack.push(10);
		stack.push(30);
		stack.push(50);
		stack.push(99);
			
		System.out.println(stack);
		
		/* Testing to check that exception is thrown when empty
		 * stack.pop(); stack.pop(); stack.pop(); stack.pop();
		 */
		
		//Running Pop()
		if(stack.empty()) {
			throw new EmptyStackException();
		} else {
			
			System.out.println("The popped element is " + stack.pop());
		}
		
		//returning max value
		if(max < stack.peek()) {
			max = stack.peek();
			System.out.println("The current maximum value is " + max);
		}
	}

}
