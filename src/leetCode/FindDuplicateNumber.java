package leetCode;

import java.util.HashSet;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		int[] nums = {1,3,4,2,2};
		System.out.println(findDuplicate(nums));

	}
	 public static int findDuplicate(int[] nums) {
	        HashSet<Integer> set = new HashSet<>();
	        for(int n : nums) {
	        	if(!set.add(n)) {
	        		return n;
	        	}
	        }
	       return set.hashCode();
	        
	    }

}
