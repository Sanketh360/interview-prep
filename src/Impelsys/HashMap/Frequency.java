package Impelsys.HashMap;

import java.util.HashMap;

public class Frequency {

	public static void main(String[] args) {
		String str = "Hello Worldw";
		
		System.out.println(free(str));	
	}
	
	public static HashMap<Character , Integer> free(String str){
		str = str.toLowerCase().trim().strip().replace(" ", "");
		HashMap<Character , Integer> map = new HashMap<>();
		char [] c = str.toCharArray();
		
		for(char n : c) {
			
			map.put(n, map.getOrDefault(n,0)+1);
		}
		
		
		return map;
		
	}
	
}
