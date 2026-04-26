package training_10Sec;
import java.util.Scanner;

public class LargestOFNnumber {
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
			return arr[0];	
		}
		int max = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
