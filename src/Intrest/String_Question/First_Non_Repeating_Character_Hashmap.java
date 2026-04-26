package Intrest.String_Question;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class First_Non_Repeating_Character_Hashmap {

	public static void main(String[] args) {
		
			String s = "eswiss";
			System.out.println(non(s));

		}
		public static char non(String s) {
			
			LinkedHashMap<Character , Integer> map = new LinkedHashMap<>();
			char [] ch = s.toCharArray();
			for(char c : ch) {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
			for(char c : map.keySet()) {
				if(map.get(c)==1) {
					return c;
				}
			}
			
			return 0;
			
		}
		

	}

