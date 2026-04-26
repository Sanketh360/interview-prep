package SAP_code;

import java.util.HashSet;

public class Occurance {
	public static void main(String[] args) {
		String str = "aabbbbeeeeffggg";
		System.out.println(count( str));

	}
	
	public static String count(String str) {
		HashSet<Character> set = new HashSet<>();
		StringBuffer s = new StringBuffer();
		int count = 0;
		for(char c:str.toCharArray()) {
			
			if(set.add(c)) {
				s.append(c);
				count++;
//				s.append(count);
			}
			else {
				count++;
			}
			
	
			s.append(count);
			count =0;
			
		}
			
		
		return s.toString();
	}

}
