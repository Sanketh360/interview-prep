package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class KFrequent {

	public static void main(String[] args) {
		int [] arr = {1,2,1,2,1,2,3,1,3,2};
		int k =2;
		
		System.out.println(Arrays.toString(topKFrequent(arr , k)));
		//HashMap<Integer,Integer> map1 = topKFrequent(arr, k );
		//System.out.println(map1);
	}
	public static int[] topKFrequent(int[] nums,int k ) {
		Arrays.sort(nums);
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int n : nums) {
			map.put(n, map.getOrDefault(n, 0)+1);
			
		}
		
		
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		PriorityQueue<Map.Entry<Integer, Integer>> pq =
			    new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());


		
		list.sort((a,b)->b.getValue()-a.getValue());
		
		int ans[] = new int[k];	
		for(int i=0;i<k;i++) {
			ans[i]=list.get(i).getKey();
		}
	 
		
		
		return ans;
	}

}
