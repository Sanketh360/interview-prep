package DevAppSys.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Find_Intersection_of_Two_Arrays {

	public static void main(String[] args) {
		int [] arr1 = {1, 2, 2, 3};
		int [] arr2 = {2, 2, 4, 1};
		
		System.out.println(Arrays.toString(inter(arr1,arr2)));
		
	}
	
	public static int[] inter(int[] arr1 , int[] arr2) {
		
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> result  = new HashSet<>();
		for(int n : arr1) {
			set.add(n);
		}
		for(int n : arr2) {
			if(set.contains(n)) {
				result.add(n);
			}
		}
		 int i = 0;
		 int [] ans = new int [result.size()];
		 for(int n : result) {
			 ans[i]=n;
			 i++;
			 
		 }
		return ans;
		
	}

}
