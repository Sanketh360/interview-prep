package DevAppSys.Arrays;

import java.util.Arrays;

public class CheckIfArrayIsSorted {
	public static void main(String[] args) {
		int [] arr = {1,1,1,2,3,5,3,4,5,5,5,5,5,66};
		
		System.out.println(sort(arr));
		
	}
	
	public static boolean sort(int[] arr) {
	
		for(int i =1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
			
		}
		return true;
		
	}
}
