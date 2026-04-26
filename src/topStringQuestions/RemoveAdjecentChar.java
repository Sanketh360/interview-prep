package topStringQuestions;

import java.util.Stack;

public class RemoveAdjecentChar {

	public static void main(String[] args) {
		String str = "abbaca";
		System.out.println(dup(str));
		

	}
	
	public static String dup(String str) {
		Stack <Character> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			
			if(!stack.isEmpty() && c == stack.peek() ) 
				stack.pop();
			else {
				stack.push(c);
			}
		}
		
		StringBuilder s = new StringBuilder();
		for(char ch : stack) {
		s.append(ch);
		}
		
		
		
		return s.toString();
	}

}
