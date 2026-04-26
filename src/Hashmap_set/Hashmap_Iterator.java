package Hashmap_set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap_Iterator {

	public static void main(String[] args) {
		int [] arr = {2,4,6,8,10,12,12,10,2,4,2,2,5,6,6,6,6};
		System.out.println(iterator(arr));
	}

	public static HashMap<Integer , Integer> iterator(int[] arr) {
		
		HashMap<Integer , Integer> map = new HashMap<>();
		
		for(int n : arr) {
			map.put(n, map.getOrDefault(n, 0)+1);
			
		}
		
		int k = 4;
		
		Iterator<Map.Entry<Integer , Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer , Integer> entry = it.next();
			if(entry.getValue()>=k) {
				it.remove();
			}
			
		}
		
		
		
		return map;
		
	}
	
}
