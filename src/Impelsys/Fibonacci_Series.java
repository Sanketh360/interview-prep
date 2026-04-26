package Impelsys;

import java.util.Arrays;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int n = 10 ;
		System.out.println(Arrays.toString(fibo(n)));
	}
	
	public static int[] fibo(int n) {
		
		int a =0;
		int b = 1;
		int [] ans = new int[n];
		ans[0]=a;
		ans[1]=b;
		
		for(int i =2 ; i<n ;i++) {
			ans[i]=a+b;
			a=b;
			b=ans[i];
		}
		
		return ans;
		
	}

}
