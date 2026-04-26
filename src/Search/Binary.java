package Search;

import java.util.Arrays;

public class Binary {
	 public static void main(String[] args) {
	        int[] arr = {11,23,25,43,55,77,87,99,444};
	        int target= 99;
	        int ans = search(arr,target);
	        System.out.println(ans);
	       
	    }
	 public static int  search(int [] arr , int target) {
		 int s=0;
		 int e=arr.length-1;
		 
		 
		 while(s<=e) {
			 int mid=s+(e-s)/2;
			 if(target  == arr[mid]) {
				 return mid;
				 
			 }
			 if(target<arr[mid]) {
				 e=mid-1;
			 }
			 else {
				 s=mid+1;
			 }
		 }
		 return -1;
	 }

}
