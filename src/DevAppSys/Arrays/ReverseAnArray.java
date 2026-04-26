package DevAppSys.Arrays;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int [] arr  = {1,2,3,4,5,67,7};
		reverce(arr);
		
		System.out.println(Arrays.toString(arr));

	}
	public static int[] reverce(int[] arr) {
		int f = 0;
		int l = arr.length-1;
		
		while(f<l){
			int temp = arr[f];
			arr[f]=arr[l];
			arr[l]=temp;
			
			f++;
			l--;
		}
		
		return arr;
		
	}

}
