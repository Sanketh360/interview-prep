package Intrest.String_Question;

import java.util.HashMap;

public class Anagrams {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "siLent";
		System.out.println(ana(s1,s2));

	}
	public static boolean ana(String s1 , String s2) {
		
		if(s1.length()!= s2.length()) {
			return false;
		}
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		HashMap<Character , Integer> map = new HashMap<>();
		for(char c : s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(char c : s2.toCharArray()) {
			if(!map.containsKey(c)) {
				return false;
			}
			map.put(c, map.get(c)-1);
			if(map.get(c)==0) {
				map.remove(c);
			}
			
		}
		
		return map.isEmpty();
		
	}

}
