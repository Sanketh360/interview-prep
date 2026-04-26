package training_10Sec;

import java.util.Arrays;

public class ConsicutiveNum {
	public static void main(String [] args) {
		int [] arr = {100,4,2,101,10,1,102,3,103,104};
		int high=arr.length-1;
		int low = 0;
		sort(arr,low,high);	
		cnum(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(cnum(arr));
	
		
	}
	public static void sort(int[] arr,int low,int high) {
		if(low>=high) {
			return;
		}
		
		int s = low;
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
				int temp = arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				s++;e--;
			}
		}
		sort(arr,low,e);
		sort(arr,s,high);
		
	}
	
	public static int cnum(int[]arr) {
		int count = 1;
		int n = arr.length;
		int f = arr[0];
		int max =1;
		for(int i=1;i<n;i++) {
			if(arr[i]==arr[i-1]+1) {
				count++;	
			}
			else {
				max = Math.max(max, count);
				count= 1;
			}
			
			
		}
		max = Math.max(max, count);

		
		return max;
		
		
	}
	

}
