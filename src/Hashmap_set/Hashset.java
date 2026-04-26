package Hashmap_set;

import java.util.HashSet;
import java.util.Iterator;;


public class Hashset {

	public static void main(String[] args) {
		int arr[] = {1,2,3,3,4,5,6,6};
		HashSet <Integer> set = new HashSet<>();
		set.add(null);
		set.add(10);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(70);
		set.add(80);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(set.size());
		
		for(int num : arr) {
			if(!set.add(num)) {
				System.out.println(num+" ");
			}
		}
		
		
	
		System.out.println(set);
		System.out.println(set.size());

		
		if(set.contains(60)) {
			System.out.println("values is there");
		}
		else {
			System.out.println("values is not there");
		}

	}

}
