package Cognizent;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {55,66,335,76,78,33,3,1};
		quick(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	public static int[] quick(int[]arr,int low,int high) {
		if(low>=high) {
			return arr;
		}
		
		int s = low;
		int e = high;
		int m = s+(e-s)/2;
		int p = arr[m];
		
		while(s<=e) {
			while(arr[s]<p){
				s++;
			}
			while(arr[e]>p){
				e--;
			}if(s<=e) {
				int temp = arr[s];
				arr[s]= arr[e];
				arr[e]=temp;
				s++;
				e--;
			}
		}
		quick(arr,low,e);
		quick(arr,s,high);

		
		
		
		return arr;	
	}
 
}
