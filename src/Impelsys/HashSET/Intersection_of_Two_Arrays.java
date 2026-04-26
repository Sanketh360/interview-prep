package Impelsys.HashSET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_Two_Arrays {

	public static void main(String[] args) {
		int[] nums1 = {3,1,2,2,1,3,3};
		int[] nums2 = {2,2,3};
		
		String[] arr = {"1,2,2,1","2,2"};
		System.out.println(Arrays.toString(intersection(arr)));
		
		
		//System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}
	
	 public static char[] intersection(String[] arr) {
		 char[] num = null ;
		 for(int i = 0;i< arr.length; i++) {
			 num = arr[i].toCharArray();
		 }
		
		  
 
	
		return num;
		
		
	}

//	public static int[] intersection(int[] nums1, int[] nums2) {
//		 
//		 HashSet<Integer> set = new HashSet<>();
//		 HashSet<Integer> result = new HashSet<>();
//		 
//		 for(int n : nums1) {
//			 set.add(n);	 
//		 }
//		 for(int n : nums2) {
//			 if(set.contains(n)) {
//				 result.add(n);
//			 } 
//		 }
//		 int[] ans = new int[result.size()];
//		 int i =0 ;
//		 
//		 for(int n : result) {
//			ans[i] = n; 
//			i++;
//		 }
//		 
//		 System.out.println(set);
//		return ans;
//		 
//	 }

}
