package Intrest.String_Question;

import java.util.Arrays;

public class Pattern_Search {

	public static void main(String[] args) {
		String haystack = "hello" , needle = "ll";
		System.out.println(search(haystack , needle));

	}
	public static int search(String h , String n) {
		char[] hay = h.toCharArray();
		char[] need = n.toCharArray();
		
		Arrays.sort(hay);
		
		int s = 0;
		int e = hay.length-1;
		while(s<e) {
			int mid = s+(e-s)/2;
			if(hay[mid]==need[0]) {
				return mid;
			}
			else {
				if(need[0]<hay[mid]) {
					e= mid-1;
				}
				else {
					s = mid+1;
				}
			}
		}
	
		return 0;
		
	}

}
