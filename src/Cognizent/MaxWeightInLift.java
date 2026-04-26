package Cognizent;
import java.util.*;

public class MaxWeightInLift {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter");
		int n = 3;
		int weight = 9;
		int arr[] = {1,5,5};//1,1,2,3,4,5
		
		System.out.println(max(n,weight,arr));
	}
	
	public static int max(int n,int w , int[] arr) {
		int count = 0;
		int sum = 0;
		
		Arrays.sort(arr);
		
		for(int i=0;i<n;i++) {
			
			
			if(sum+arr[i]<=w) {
				sum = sum +arr[i];
				count++;
			}
			
		}
		return count;
	}

}