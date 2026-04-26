package Impelsys.HashMap;

import java.util.HashMap;

import Hashmap_set.Hashmap;

public class Count_Frequency_of_Elements {

	public static void main(String[] args) {
		String name = "Impulsys";
		System.out.println(count(name));

	}
	
	public static HashMap<Character , Integer> count(String name){
		
		
		char[] n = name.toCharArray();
		HashMap<Character , Integer> map = new HashMap<>();
		
		for(char c : n) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		
		
		return map;
		
	}

}
