package ITC_Question;

import java.util.Arrays;

public class Shift_Char {
	public static void main(String[] args) {
		
		char[] arr = {'a','b','c','d'};
		int n= arr.length;
		
		int fist = 0;
		int sec = 1;
		
		for(int i=0;i<n;i++) {
			if(i%2==0 ) {
				swap(arr,i,i+1);
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(char[] arr,int f,int s) {
		char temp = arr[f];
		arr[f]=arr[s];
		arr[s]=temp;
		
	}
	

}
