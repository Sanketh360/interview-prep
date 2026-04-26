package DevAppSys.Arrays;
import java.util.Scanner;

public class LargestElementinanArray {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the array length : ");
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//		System.out.println("Enter the array Element : ");
//
//		for(int i = 0;i<n;i++) {
//			arr[i] = sc.nextInt();
//		}
		
		int n = 5;
		int arr[] = {116,9,7,4,93};
		
		System.out.println(largest(arr,n));
		

	}
	public static int largest(int arr[],int n) {
		int max = arr[0];
		for(int i=1;i<n ;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
	}

}
