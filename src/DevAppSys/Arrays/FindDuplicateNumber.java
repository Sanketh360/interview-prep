package DevAppSys.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		int [] arr = {1,2,4,3,3,5,6,6,1};
		System.out.println(Arrays.toString(find(arr)));

	}
	public static int[] find(int [] arr) {
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> dup = new HashSet<>();
		
		for(int n:arr) {	
			if(!set.contains(n)) {
			     set.add(n);
			}
			else {
				dup.add(n);
			}
				
		}
		int ans[]=new int[dup.size()];
		int i=0;
		
		for(int n:dup) {
			ans[i]=n;
			i++;
		}
		return ans ;
	}
	

}
