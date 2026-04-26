package Intrest.String_Question;

import java.util.*;

public class Remove_Duplicate_Characters {

	public static void main(String[] args) {
		String s = "programming";
		System.out.println(dup(s));

	}
	
	public static String dup(String s) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		LinkedHashSet<Character> dup = new LinkedHashSet<>();

		char[] ch = s.toCharArray();
		for(char c : ch) {
		if(!set.contains(c)) {
				set.add(c);
			}
		else {
			dup.add(c);
		}
		}
		int i = 0 ;
	   char[] c = new char[dup.size()];
	   for(char s1 : dup) {
		   c[i]=s1;
		   i++;
	   }
		
		return new String(c) ;
		
	}

}
