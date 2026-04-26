package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class maxSlidingWindow {
	public static void main(String[]args) {
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k= 3;
		
		System.out.println(Arrays.toString(maxSlidingWindow(nums,k )));
		
	}
	
	public static int[] maxSlidingWindow (int [] nums , int k) {
		int i =0;
		int j = k;
		int arr[] = new int[nums.length-k+1];
		int n =0;
		 int index = 0;
		
		while(j<=nums.length) {
			  arr[index]=Window( nums, i , j);
		      index++;
		      i++;
		      j++;
		}
		
		return arr;
	}
	
	
	 public static int Window(int[] nums , int i , int j)  {
	        int inmax = Integer.MIN_VALUE;
	        for(int x = i;x<j;x++) {
	        	
	        	if (nums[x]>inmax) {
	        		inmax=nums[x];
	        	}
	        }
	        //System.out.println(inmax);

	        return inmax;
	        
	 }
	    
	    }
	


