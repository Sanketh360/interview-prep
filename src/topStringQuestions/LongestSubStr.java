package topStringQuestions;

import java.util.HashSet;

public class LongestSubStr {

	public static void main(String[] args) {
		String str = "abcabcbb";
		
		System.out.println(sub(str));

	}
	public static int  sub(String str) {
		int start =0;
		int maxlen =0;
		HashSet <Character> set = new HashSet<>();
		
		for(int end=0;end<str.length();end++) {
			
			char c = str.charAt(end);
			while(set.contains(c)) {
				set.remove(str.charAt(start));
				start++;
			}
			set.add(c);
			
			maxlen=Math.max(maxlen, end-start+1);
			
		}
		return maxlen;
			
	}
	
	
	

}
