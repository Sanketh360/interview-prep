package practice;

import java.util.Arrays;

public class CombineArray {
	public static void main(String [] args) {
		int [] arr1 = {55,66,335,76,78,33};
		int [] arr2 = {1,2,3,4,5};
		int arr3[]=combine(arr1,arr2);
		System.out.println(Arrays.toString(arr3));
		
	}
	public static int[] combine(int arr1[],int arr2[]) {
		int[] arr3= new int[arr2.length+arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[arr1.length+i]=arr2[i];
		}
		
		
		return arr3;
	}

}
