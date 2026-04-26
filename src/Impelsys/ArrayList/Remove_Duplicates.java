package Impelsys.ArrayList;

import java.util.ArrayList;

public class Remove_Duplicates {

	public static void main(String[] args) {
		
		int [] arr = {2,5,6,2,7,8,8,5,5};
		
		System.out.println(dup(arr));

	}
	
	public static ArrayList<Integer> dup(int [] arr){
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int n : arr) {
			
			if(!list.contains(n)) {
				list.add(n);
			}
			
		}
		return list;
		
	}

}
