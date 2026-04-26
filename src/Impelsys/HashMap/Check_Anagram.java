package Impelsys.HashMap;

import java.util.HashMap;

public class Check_Anagram {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silente";
		
		System.out.println(anagram(s1,s2));

	}
	public static boolean anagram(String s1 , String s2) {
		
		HashMap<Character , Integer> map = new HashMap<>();
		char[] c = s1.toCharArray();
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		for(char n : c) {
			map.put(n, map.getOrDefault(n, 0)+1);
		}
		for(char n : s2.toCharArray()) {
			if(!map.containsKey(n)|| map.get(n)==0) {
				return false;
			}
			map.put(n, map.get(n)-1);
		}
		return true;
		
	}

}
