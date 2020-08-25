package tw.bear.leetcode;

import java.util.Stack;

public  class StackReverse {
	public static void ReverseStack(Stack<Integer> stack) {
		if(!stack.isEmpty()) {
			int top = stack.pop();
			ReverseStack(stack);
			InsertBottom(stack,top);
			
		}
	}
	public static void InsertBottom(Stack<Integer> stack,int bottom) {
		if(stack.isEmpty()) {
			stack.push(bottom);
			return;
		}
		int top = stack.pop();
		InsertBottom(stack, bottom);
		stack.push(top);
	}
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		for(int i=stack.size()-1;i>0;i--)
		{
			System.out.println(stack.get(i));
		}
		
		ReverseStack(stack);
		
	for(int i=stack.size()-1;i>=0;i--)
	{
		System.out.println(stack.get(i));
	}
	}
	
}
