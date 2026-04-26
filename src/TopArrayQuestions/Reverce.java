package TopArrayQuestions;

import java.util.Arrays;

public class Reverce {

	public static void main(String[] args) {
		int arr[]= {9,8,7,6,5,4,3,2,1};
		int arr1[]= {1,2,3,4,5,6,7};
		 
		 Reverce(arr);
		 rev(arr1);
		 
		 System.out.println(Arrays.toString(arr));
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
	}
	
	public static int[]  Reverce(int[] arr) {
		int n=arr.length;
		int s= 0;
		int e=n-1;
		while(s<e) {
			int temp = arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
		return arr;
		
		
	}
	
	
	public static void  rev(int[] arr) {
		int n=arr.length;
//		int s= 0;
//		int e=n-1;
		int t=	3;
		
		int ase = Arrays.binarySearch(arr,6);
		System.out.println(ase);
		
		
	}
	

}
