package topStringQuestions;

import java.util.HashSet;

public class NonRepeating {
	public static void main(String[] args) {
		String str = "abcabcd";
	 char c= non(str);
		System.out.println(c);

	}
	public static Character non(String str) {
		HashSet<Character> set =  new HashSet<>();
		HashSet<Character> repeated  =  new HashSet<>();

		for(char n:str.toCharArray()) {
			if(!set.add(n)) {
				repeated.add(n);
				
			}
			
			
		}
//		for(char n:str.toCharArray()) {
//			if(set.add(n)) {
//				repeated.add(n);
//				
//			}
//			
//			
//		}
		System.out.println(repeated);

		for(char c:str.toCharArray()) {
			if(!repeated.contains(c)) {
				return c;
			}
			
		}
		
		
		
		return null;
		
	}

}
