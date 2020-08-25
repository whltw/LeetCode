package tw.bear.leetcode;

import java.util.Stack;

public class BracketMatch {
	
	public static boolean match(String a) {
		Stack<Character> stack = new Stack<Character>();
		char s ='男';
		if(a.length()%2!=0)
			return false;
		
		for(Character c :a.toCharArray())
		{
			if(c =="(".charAt(0)) 
				stack.push("(".charAt(0));
			else if(c =="{".charAt(0)) 
				stack.push("{".charAt(0));
			else if(c=="{".charAt(0)) 
				stack.push("[".charAt(0));
			else if(!stack.isEmpty()&&c==")".charAt(0)) {
				if(!stack.pop().equals("(".charAt(0)))
					return false;
			}
				
			else if(!stack.isEmpty()&&c=="}".charAt(0)) {
				if(!stack.pop().equals("{".charAt(0))) 
					return false;
			}
				
			else if(!stack.isEmpty()&&c=="]".charAt(0)) {
				if(!stack.pop().equals("[".charAt(0))) 
					return false;
			}	
		}
		return true;
	}
	public static void main(String[] args) {
		String a="[{()}]";
		System.out.println(match(a));
		char a1 = 'a';
		System.out.println(a1); 
	}
}
