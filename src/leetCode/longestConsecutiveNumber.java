package leetCode;

import java.util.Arrays;
import java.util.*;

public class longestConsecutiveNumber {
	

	public static void main(String[] args) {
		int  [] nums = {0,3,7,2,5,8,4,6,0,1};
		
		System.out.println((longestConsecutive(nums)));
 		

	}
	
	 public static int  longestConsecutive(int[] nums) {
//		 HashSet <Integer> set = new HashSet<>();
//		 for(int n : nums) {
//			 set.add(n);
//		 }
//		 
//		 List <Integer> sort = new ArrayList<>(set);
//		 Collections.sort(sort);
//		 
//		 int [] ans = new int[sort.size()];
//		 
//		 for(int i=0;i<ans.length;i++) {
//		     ans[i] = sort.get(i); 
//		 }
		 
		 TreeSet<Integer> tree = new TreeSet<>();
		 
		 for(int n : nums) {
			 tree.add(n);
		 }
		 
		 int arr[] = new int[tree.size()];
		 int i=0;
		 for(int num : tree) {
			 arr[i]= num;
			 i++;
		 }
		 
		 //int curr =1;
		 int ans = 1;
		 int count=1;
		 for(int j=1;j<arr.length;j++) {
			 if(arr[j]==arr[j-1]+1) {
				 	 count++;
			 }
			 else {
				 ans = Math.max(ans, count);
				 count = 1;
			 }
		 }
		 ans = Math.max(ans, count);	 
		 
		 System.out.print(Arrays.toString(arr));
		 System.out.println();

		 
		 return ans;
		 
	    }
	}


