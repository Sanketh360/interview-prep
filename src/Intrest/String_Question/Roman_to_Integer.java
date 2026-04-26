package Intrest.String_Question;

import java.util.HashMap;

public class Roman_to_Integer {

	public static void main(String[] args) {
		String str = "MCMXCIV";
		System.out.println(roman(str));
		
	}

	public static int roman(String s) {
		
		HashMap<Character , Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		char[] arr = s.toCharArray();
		int result = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {	
			int curr = map.get(arr[i]);
			if(i<arr.length-1) {
				int next = map.get(arr[i+1]);
				
				if(curr<next) {
					result -= curr;
				}
				else{
					result += curr;

				}
			}
			else {
				result += curr;
			}
		}
		
		
		return result;
		
	}
	
	
}
