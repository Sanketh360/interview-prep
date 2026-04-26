package Sort;

import java.util.Arrays;

public class Quick {
	public static void main(String [] args) {
		int [] arr = {22,44,33,66,88};
		int high=arr.length-1;
		int low = 0;
		sort(arr,low,high);	
		System.out.println(Arrays.toString(arr));
		
	}
	public static void sort(int []arr,int low ,int high) {
		if(low>=high) {
			return;
		}
		int s=low;
		int e=high;
		int mid = s+(e-s)/2;
		int p=arr[mid];
		
		while(s<=e) {
			while(arr[s]<p) {
				s++;
			}
			while(arr[e]>p) {
				e--;
				
			}
			if(s<=e) {
				int temp=arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				s++;
				e--;
			}
		}
		sort(arr,low,e);
		sort(arr,s,high);
		
	}
	

}
