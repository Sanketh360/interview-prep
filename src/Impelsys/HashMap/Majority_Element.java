package Impelsys.HashMap;

import java.util.HashMap;

public class Majority_Element {

	public static void main(String[] args) {
			int[] arr = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(arr));	

	}
	public static int majorityElement(int[] nums) {
		
		HashMap<Integer , Integer> map = new HashMap<>();
		for(int n : nums) {
			map.put(n, map.getOrDefault(n, 0)+1);
		}
		int n = nums.length;
		
		for(int c : map.keySet()) {
			if(map.get(c)>n/2) {
				return c;
			}
		}
		
		
		
		
		
		return 0;
		
	}

}
