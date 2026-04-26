package Impelsys;

import java.util.Arrays;
import java.util.HashSet;

public class Remove_Duplicate_Elements {

	public static void main(String[] args) {
		int[] arr = {10,1,2,3,4,4,3,5,7,7,2};
		System.out.println(Arrays.toString(dup(arr)));
	}
	public static int [] dup(int[]arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int n : arr) {
			set.add(n);
		}
		int[]ans = new int[set.size()];
		int i=0;
		
		for(int n:set) {
			ans[i]=n;
			i++;
		}
		return ans;	
	}
}
