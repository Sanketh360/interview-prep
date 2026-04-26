package DevAppSys.Arrays;

import java.util.Arrays;

public class FIxed_SIze_Sliding_Window {
	public static void main(String[] args) {
		int [] arr = {2, 1, 5, 1, 3, 2};
		int k = 3;
		System.out.println(window(arr,k));
		System.out.println(Arrays.toString(windowArray(arr,k)));	
	}
	public static int window(int[] arr , int k) {
		
		if(arr.length<k) {
			return -1;
		}
		
		int windowsize = 0;
		for(int i = 0 ;i< k ; i++) {
			windowsize += arr[i];  	
		}
		int max = windowsize ; 
		
		for(int i= k ;i< arr.length ;i++) {
			windowsize = windowsize+arr[i]-arr[i-k];
			max = Math.max(max,windowsize);
		}
		
		return max;
	}

	
public static int[] windowArray(int[] arr , int k) {
	
	if(arr.length<k) {
		return new int[0];
	}
		
	int ans[] = new int[k];
	
		int windowsize = 0;
		for(int i = 0 ;i< k ; i++) {
			windowsize += arr[i];  	
		}
		int max = windowsize ; 
		int start = 0;
		
		for(int i= k ;i< arr.length ;i++) {
			windowsize = windowsize+arr[i]-arr[i-k];
			if(windowsize>max) {
				max=windowsize;
				start = i-k+1;
			}
			
		}
		for(int i = 0;i<k;i++) {
			ans[i]= arr[start+i];
		}
		return ans;
	}
}
