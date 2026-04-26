package DevAppSys.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class Find_First_Non_Repeating_Character {

	public static void main(String[] args) {
		String name = "swwiissy";
		System.out.println(first(name));
	}
	
	public static char first(String name) {
		LinkedHashMap<Character , Integer> map = new LinkedHashMap<>();
		char[] arr = name.toCharArray();
		for(char n : arr) {
			map.put(n, map.getOrDefault(n, 0)+1);	
		}
	
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		
		
		return '0';
		
	}

}
