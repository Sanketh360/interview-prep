package training_10Sec;

import java.util.Arrays;

public class FootballPlayers {
	public static void main(String[] args) {
		int n= 1;
		int[] arr = {1,2,3,4,5};
		int s = 0;
		int e = arr.length;
		System.out.println(Arrays.toString(shift(arr,n))); 
	}
	public static int[] shift(int [] arr , int n) {
		int num = arr.length;
		int s=0;int e=num-1;
		while(s<e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e]=temp;
			s++;
			e--;
			
		}
		
		//System.out.println(Arrays.toString(arr));
		int f = n;
		int l = arr.length-1;
		while(f<l) {
			int sh = arr[f];
			arr[f]=arr[l];
			arr[l]=sh;
			f++;
			l--;
		}
		
		return arr;
		
	}

}
