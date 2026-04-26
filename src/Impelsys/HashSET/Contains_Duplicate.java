package Impelsys.HashSET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Contains_Duplicate {

	public static void main(String[] args) {
	int[] arr = {2, 3, 4, 5,5, 8};
	
	System.out.println(Arrays.toString(dup(arr)));
	System.out.println((dup1(arr)));
	System.out.println(Arrays.toString(dup2(arr)));
	System.out.println((dup3(arr)));

	}
	public static int[] dup(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int n :arr) {
			set.add(n);	
			}
		int[] ans = new int[set.size()];
		int i=0;
		for(int n : set) {
			ans[i]=n;
			i++;
		}	
		return ans;
	}
	
	public static boolean dup1(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int n : arr) {
			if(set.contains(n)) {
				return true;
			}
			else {
				set.add(n);
			}
		}
		return false;	
	}
	
	
	public static int[] dup2(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> dup = new HashSet<>();
		
		for(int n : arr) {
			if(set.contains(n)) {
				dup.add(n);
			}
			else {
				set.add(n);
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int  n : dup) {
			list.add(n);
		}
		int [] ans = new int[list.size()];
		 
		for(int i = 0 ; i< list.size();i++ ) {
			ans[i]=list.get(i);
		}
		
		return ans;
	}
	
	public static int dup3(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		int count = 0 ;
		for(int n : arr) {
			if(set.contains(n)) {
				count++;
			}
			else {
				set.add(n);
			}
		}
		return count;	
	}
	
	

	
}
