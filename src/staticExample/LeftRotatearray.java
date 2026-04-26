package staticExample;

import java.util.Arrays;

public class LeftRotatearray {
	public static void main(String [] args) {
		int []arr= {1,2,3,4,5};
		int k=2;
		rotate(arr,k);
	System.out.println(Arrays.toString(arr));
		
	}
	
	public static void rotate(int []nums,int k) {
		int n=nums.length;
		k=k%n;
		swap(nums,0,n-1);
		swap(nums,0,k-1);
		swap(nums,k,n-1);
		
	}
	static void swap(int [] arr,int s,int e) {
		while(s<e) {
		int temp=arr[s];
		arr[s]=arr[e];
		arr[e]=temp;
		s++;
		e--;
		
	}
	}

}
