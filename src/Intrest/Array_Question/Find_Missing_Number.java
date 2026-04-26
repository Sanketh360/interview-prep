package Intrest.Array_Question;

import java.util.Arrays;

public class Find_Missing_Number {

	public static void main(String[] args) {
		int[] arr = {100, 101, 103, 104};
		System.out.println(find(arr));
		System.out.println(find1(arr));

 	}
	public static int find(int[] arr) {
		Arrays.sort(arr);
		for(int i = 1 ; i < arr.length-1 ; i++) {
			if(arr[i]!=arr[i-1]+1) {
				return arr[i-1]+1;
			}
		}
		
		
		return arr[0]-1;
		
	}
	
	public static int find1(int[] arr) {
	    int min = Integer.MAX_VALUE;
	    int max = Integer.MIN_VALUE;
	    int sum = 0;

	    for (int n : arr) {
	        min = Math.min(min, n);
	        max = Math.max(max, n);
	        sum += n;
	    }

	    int totalCount = max - min + 1;
	    int expectedSum = (min + max) * totalCount / 2;

	    return expectedSum - sum;
	
	}
	

}
