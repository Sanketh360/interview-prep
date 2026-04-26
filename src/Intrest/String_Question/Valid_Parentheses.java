package Intrest.String_Question;

import java.util.Stack;

public class Valid_Parentheses {

	public static void main(String[] args) {
		String s = "([]{})";
		System.out.println(valid(s));
	}
	public static boolean valid(String s) {
		
		Stack<Character> stk  = new Stack<>();
		char [] ch = s.toCharArray();		
		for(char c : ch) {		
			if(c == '(' || c== '[' || c == '{') {
				stk.push(c);
			}
		
		else {
			if(stk.isEmpty()) return false;
			
			char top = stk.pop();
			
			if((c == ')' && top != '(') ||
	                (c == ']' && top != '[') ||
	                (c == '}' && top != '{')) {
				return false;
			}
			}	
			}
		
		return stk.isEmpty();
		
	}

}
