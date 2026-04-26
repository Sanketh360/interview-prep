package Impelsys.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_Maximum_Element {

	public static void main(String[] args) {

	int arr[] = {2,3,6,8,9,55,3};
	System.out.println((max(arr))); 
	
	}
	
	public static int max(int[] arr){	
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int n: arr) {
			list.add(n);
		}
		
		int sum = list.get(0);
		for(int i =1 ;i< list.size();i++) {
			if(list.get(i)>sum) {
				sum = list.get(i);
			}
			
		}
		return sum;
		
	}
	
	
	

	}


