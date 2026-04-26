package DevAppSys.Arrays;

import java.util.*;

public class SequenceValidation {

	public static void main(String[] args) {
		int[] arr = {01,102,104,105,106};
		String name = "this is the best name";
		String [] ans = name.split(name);
		
		System.out.println(valid(arr));

	}
	
	public static String valid(int[] arr) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>(); 
		for(int n : arr) {
		if(set.contains(n)) {
			return "Rejected";
		}
		}
		
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				return "Rejected";
			}
		}
		
		
		
		
		return "Accepted";
		
	}

}
