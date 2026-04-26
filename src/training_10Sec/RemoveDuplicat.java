package training_10Sec;

import java.util.HashSet;

public class RemoveDuplicat {
	public static void main(String[] args) {
		int [] arr = {10,10,10,10,30,30,20};
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> dup = new HashSet<>();

		
		for(int a : arr) {
			if(!set.add(a)) {
					dup.add(a);
					//System.out.println(a);	
			}
		}
		for(int b:dup) {
			System.out.println(b);
		}
		

	}
	

}
