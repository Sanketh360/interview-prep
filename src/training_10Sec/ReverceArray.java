package training_10Sec;

import java.util.Arrays;

public class ReverceArray {
	public static void main(String[] args) {
		int [] arr = {1,4,3,2,6,5};
	
		reverce(arr);
				
	}
	public static void reverce(int[] arr) {
		int f  = 0;
		int l = arr.length-1;
		while(f<l) {
			int temp = arr[f];
			arr[f]=arr[l];
			arr[l]=temp;
			f++;
			l--;
					
		}
		System.out.println(Arrays.toString(arr));
	}


}
