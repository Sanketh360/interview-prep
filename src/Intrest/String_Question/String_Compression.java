package Intrest.String_Question;

import java.util.*;
import java.util.Map.Entry;

public class String_Compression {

	public static void main(String[] args) {
		String s = "aaaaabbaaaccccc";
		System.out.println(com(s));
		
	}
	
	
	public static String com(String s) {
		LinkedHashMap<Character , Integer> map  = new LinkedHashMap<>();
		char[] ch = s.toCharArray();
		for(char c : ch) {
			map.put(c , map.getOrDefault(c , 0)+1);
		}
		
		StringBuilder sb   = new StringBuilder();
		
		Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Entry<Character, Integer> entry = it.next();
			sb.append(entry.getKey());
			sb.append(entry.getValue());	
		}
	
	    
		return sb.toString();
		
	}

}
