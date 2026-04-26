package topStringQuestions;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDupElement {

	public static void main(String[] args) {
		String str = "aaabbbcddeeffgghijkklllmn";
//		HashSet ans = remove(str);
//		StringBuffer s = new StringBuffer();
		System.out.println(remove(str));
		
		
		
		

	}
	
	public static StringBuffer remove(String s) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(char c : s.toCharArray()) {
			set.add(c);	
		}
		
		StringBuffer ans = new StringBuffer();
		for(char c : set) {
			ans.append(c);
		}
		
		return ans;
		
		
	
		
		
		
		
	}

}
