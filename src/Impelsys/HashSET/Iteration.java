package Impelsys.HashSET;

import java.util.HashSet;
import java.util.Iterator;

public class Iteration {

	public static void main(String[] args) {
		
		int[]arr = {2,3,4,5,6};
		
		iter(arr);
		
	}
	
	public static HashSet<Integer> iter(int[] arr){
				
		HashSet<Integer> set = new HashSet<>();
		for(int n : arr) {
			set.add(n);
		}
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		return null;
		
	}
	

}
