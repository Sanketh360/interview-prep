package Impelsys;

import java.util.Arrays;

public class Factorial {

	public static void main(String[] args) {
		int n = 5;
	   int result[]= fact(n);
	   for(int i = 0 ; i< result.length-2 ; i++) {
		   System.out.print(result[i]+"*");
		 
	   }
	   System.out.print(result[result.length-2]);
	   System.out.print(" = ");
	   System.out.print(result[result.length-1]);
	
		
	}
	
	public static int[] fact(int n) {
		int arr[]=new int[n+1];
		int temp=1;
		int j =0;
		for(int i = n ; i>0 ;i--) {
			arr[j]=i;
			j++;
			temp=temp*i;
			arr[arr.length-1]= temp;
		}
		return arr;
		
	}

}
