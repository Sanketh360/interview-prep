package DevAppSys.Strings;
import java.util.*;
import java.util.Map.Entry;
public class RomanToInteger {

	public static void main(String[] args) {
		String name  = "III";
		System.out.println(romanToInt(name));

	}
	
	public static int romanToInt(String s) {
		HashMap<Character , Integer > map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		char[] arr = s.toCharArray();
		
		int result = 0;
		
		
		for(int i= 0 ; i< arr.length ; i++) {
			int curr = map.get(arr[i]);
			
			if(i<arr.length-1) {
				int next = map.get(arr[i+1]);
			
			
			if(curr < next) {
				result -= curr;  
			}
			else {
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
