package DevAppSys.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Find_Union_of_Two_Arrays {

	public static void main(String[] args) {
		
			int [] arr1 = {1, 2, 3 ,2,4};
			int [] arr2 = {3, 4, 5 ,5,6};
			
			System.out.println(Arrays.toString(inter(arr1,arr2)));
			
		}
		
		public static int[] inter(int[] arr1 , int[] arr2) {
			
			HashSet<Integer> set = new HashSet<>();
			HashSet<Integer> result  = new HashSet<>();
			for(int n : arr1) {
				set.add(n);
			}
			for(int n : arr2) {
				set.add(n);
			}
			
			
			int [] ans = new int[set.size()];
			int i=0;
			for(int n: set) {
				ans[i]=n;
				i++;
			}
			
			return ans;
			
	}

}
