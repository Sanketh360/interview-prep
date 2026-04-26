package Hashmap_set;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		int []arr= {1,3};
		HashMap<String , Integer> map = new HashMap<>();
		
		map.put(null, null);
		map.put("sanketh", 1);
		
		map.put("var", 2);

		map.put("bahav", 1);
		map.put("bahav", 5);


		map.put("ani", 3);
		map.put("jhon", 4);
		map.put("nav", 5);
		map.put("liki", 6);
		
//	System.out.println(map.get("liki"));
//		
//		for(Map.Entry <String , Integer> e : map.entrySet()) {
//			System.out.println(e.getKey()+"="+ e.getValue());
//			
//		}
		
//		Set<String> key = map.keySet();
//		for(String str:key) {
//		System.out.println(str+"="+map.get(str));
//		}
		HashMap<Integer , Integer> set = new HashMap<>();		
//		set.put(1, 1);
//		
//		set.put(2, 2);
//
//		set.put(3, 1);
//		set.put(4, 5);
//
//
//		set.put(4, 3);
//		set.put(5, 4);
//		set.put(5, 5);
//		set.put(6, 6);
		String str = "programing";
		
		for(int c : arr) {
			set.put(c,set.getOrDefault(c, 0)+1);	
		}
		
		for(Map.Entry<Integer, Integer> m : set.entrySet()) {
			if(m.getValue()>=arr.length/3) {
				System.out.println(m.getKey());
			}
			
		}
		
	System.out.println(set);
		

		
	

	}

}
