package DevAppSys.Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int [] arr = {1,1,1,2,3,3,4,5,5,5,5,5,66};
		int [] ans = remove(arr);
		System.out.println(Arrays.toString(ans));
		
	}
//	public static int[] remove(int[] arr) {
//		LinkedHashSet <Integer> set = new LinkedHashSet<>();
//		for(int n : arr) {
//			set.add(n);
//		}
//		
//	int ans[] = new int [set.size()];
//	int i=0;
//	for(int n : set) {
//		ans[i]=n;
//		i++;
//	}
//	
//	return ans;
//	}
	
	public static int[] remove(int[] arr) {
		int index = 0;
		for(int i = 1; i<arr.length;i++) {
			if(arr[i]!=arr[index]) {
				index++;
				arr[index]=arr[i];
			}
		}
		 int[] uni = new int[index+1];
		
		for(int i=0;i<uni.length;i++ ) {
			uni[i]=arr[i];
		}
		return uni;
		
	}
	

}
