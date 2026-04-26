package Hashmap_set;

import java.util.HashMap;
import java.util.HashSet;

public class Unian_Hash {
	public static void main(String[] args) {
		int []arr1= {7,3,9,3,6};
		int []arr2= {6,3,9,2,9,4};
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for(int num : arr1) {
			set1.add(num);
		}
		
		
		int count =0;
		for(int i=0;i<arr2.length;i++) {
			if(set1.contains(arr2[i])) {
				count++;
				set1.remove(arr1[i]);	
			}
			
		}
		System.out.println(count);	
		
		
		for(int num1 : arr2) {
			set2.add(num1);
		}
		
		set1.retainAll(set2);
		System.out.println(set1);

}
}