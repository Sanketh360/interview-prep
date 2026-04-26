package Cognizent;

import java.util.Arrays;

public class ReverceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sanketh";
	reverce (str);
		

	}
	
	public static void reverce(String str) {
		char[] arr = str.toCharArray();
		int l =0;
		int r = arr.length-1;
		
		while(l<r) {
			char temp = arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}
		arr.toString();
		System.out.println(arr);
		
		
		
		
	}

}
