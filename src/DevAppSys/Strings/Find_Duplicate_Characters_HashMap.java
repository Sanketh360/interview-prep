package DevAppSys.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.*;
import java.util.Map.Entry;

public class Find_Duplicate_Characters_HashMap {

		public static void main(String[] args) {
		String name = "programming";
		System.out.println(Arrays.toString(find(name)));
		System.out.println(Arrays.toString(find1(name)));


	}
		
		public static char[] find(String name) {
			HashMap<Character , Integer> map = new HashMap<>();
			
			
			
			char [] arr = name.toCharArray();
			for(char n : arr ) {
				map.put(n, map.getOrDefault(n, 0)+1);
			}
			List<Character> list  = new ArrayList<>();
			int index = 0;
			for(Map.Entry<Character,Integer> entry : map.entrySet()) {
				if(entry.getValue()>1) {
					list.add(entry.getKey());
				}	
			}
			char [] ans = new  char[list.size()];
			for(char  n : list) {
				ans[index]=n;
		index++;	
			}	
			return ans;	
		}
		
		
		
		public static char[] find1(String name) {
			HashMap<Character , Integer> map = new HashMap<>();
			
			
			char [] arr = name.toCharArray();
			for(char n : arr ) {
				map.put(n, map.getOrDefault(n, 0)+1);
			}
			
			List<Character> list  = new ArrayList<>();
			
			int index = 0;
			
			Iterator<Map.Entry<Character , Integer>> it = map.entrySet().iterator();
			while(it.hasNext()) {
				Map.Entry<Character , Integer> entry = it.next();
				if(entry.getValue()>1) {
					list.add(entry.getKey());
				}	
				
			}
			
char [] ans = new  char[list.size()];

			
			for(char  n : list) {
				ans[index]=n;
		index++;	
			}
			
				
			return ans;	
			
		
		}
		
}

