package Intrest.Array_Question;

import java.util.HashSet;

public class Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		int[] arr = {1,2,1,2,3,3,5};
		System.out.println(dup(arr));

	}
	
	public static int dup(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int n : arr) {
			set.add(n);
		}
		int ans = set.size();
		
		
		return ans;
		
	}

}
