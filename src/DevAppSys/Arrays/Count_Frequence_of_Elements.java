package DevAppSys.Arrays;

import java.util.HashMap;

public class Count_Frequence_of_Elements {

	public static void main(String[] args) {
	int [] arr = {1,1, 2, 2, 3, 3, 3};
	System.out.println(frequence(arr));
	

	}

	public static HashMap<Integer,Integer> frequence(int[] arr){
		HashMap<Integer,Integer> map = new  HashMap<>();
		for(int n : arr) {
			map.put(n, map.getOrDefault(n,0)+1);
		}
		
		return map;
		
		
	}
	
}
