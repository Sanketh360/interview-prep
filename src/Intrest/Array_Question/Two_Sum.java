package Intrest.Array_Question;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {

	public static void main(String[] args) {
		int[] arr = {3,2,4};
		int target = 6 ;
		System.out.println(Arrays.toString (sum(arr,target)));

	}
	public static int[] sum(int[] arr , int target) {
		HashMap <Integer , Integer> map = new HashMap<>();
		
		for(int i = 0 ; i<arr.length;i++) {
			
			int diff = target - arr[i];
			if(map.containsKey(diff)) {
				return new int[] {map.get(diff),i};
			}
			map.put(arr[i], i);
			
		}
		
		return new int[] {-1,-1};

		
	}

}
