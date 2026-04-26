package training_10Sec;

import java.util.Arrays;
public class FootballOpti {
	public static void main(String[] args) {
		int n= 3;
		int[] arr = {1,2,3,4,5};
		int s = 0;
		int e = arr.length-1;
		shift(arr,s,e);
		shift(arr,n,e);
		shift(arr,s,n-1);
		System.out.println(Arrays.toString(arr)); 
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" "); 
//		}
	}
	public static int[] shift(int [] arr , int a , int b) {
		int num = arr.length;
		
		while(a<b) {
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b]=temp;
			a++;
			b--;	
		}
		return arr;	
	}
}
