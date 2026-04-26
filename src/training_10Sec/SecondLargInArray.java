package training_10Sec;

import java.util.Scanner;

public class SecondLargInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n==0) {
			System.out.println("cannot be 0");
			return;
		}
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		System.out.println(max(arr));
	}
	
	public static int max(int[] arr) {
		if(arr.length==1) {
			System.out.println("Atleast 2 num requred");	
			return -1;
		}
		
		int max = arr[0];
		int smax = 0;
		for(int i =1;i<arr.length;i++) {
			if(arr[i]>max) {
				smax = max;
				max=arr[i];
			}
		}
		return smax;
	}


}
