package Impelsys;

import java.util.HashMap;

public class Longest_word_in_string {

	public static void main(String[] args) {
		String str = "i love programing with java program jkjkjkjkjk ";
		
		System.out.println(longest(str));
	}
	
	public static String longest(String str) {
		
		String[] s = str.trim().split("\\s+");
		
		int max=0;
		String maxlong = "";
		
		for(String word : s) {
			if(word.length()>max) {
				max = word.length();
				maxlong  = word;
				
			}
		}
		
		return maxlong;	
	}
	

}
