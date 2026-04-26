package Intrest.String_Question;

import java.util.*;

public class First_Non_Repeating_Character {

	public static void main(String[] args) {
		String s = "swwiss";
		System.out.println(non(s));

	}
	public static char non(String s) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		LinkedHashSet<Character> dup = new LinkedHashSet<>();

		char[] ch = s.toCharArray();
		for(char c : ch) {
			if(set.contains(c)) {
				dup.add(c);
			
			}
			else {
				set.add(c);
			}
		}
		
		set.removeAll(dup);
		for(char c : set) {
			return c;
		}
		
		return '_';
		
	}

}
