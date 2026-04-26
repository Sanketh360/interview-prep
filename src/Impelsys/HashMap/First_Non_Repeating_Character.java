package Impelsys.HashMap;

import java.util.HashMap;

public class First_Non_Repeating_Character {

	public static void main(String[] args) {
		String name = "impulsysimp";
		System.out.println(non(name));
	}

	public static char non(String name) {
		
		char[] c  = name.toCharArray();
		HashMap<Character , Integer> map = new HashMap<>();
		for(char n : c) {
			map.put(n, map.getOrDefault(n, 0)+1);
		}

		
		for(char n : c) {
			if(map.get(n)==1) {
				return n;
			}
		}
		
		
		return 0;
		
	}
}
