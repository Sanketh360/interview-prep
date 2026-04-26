package leetCode;

import java.util.Arrays;

public class ProductOfArrExceptSelf {

	public static void main(String[] args) {
		int [] nums  = {-1,1,0,-3,3};
		int n = nums.length;
		System.out.println(Arrays.toString(productExceptSelf(nums)));
		

	}
	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int curr = 1;
		int[] arr = new int[n];
		arr[0]=nums[0];
		int ans[] = new int[n];
		
		 if(n==2){
             arr[0]=nums[1];
             arr[1]=nums[0];
             return arr;
         }
		
		
		for(int i=1;i<n;i++) {
			arr[i]=Math.abs(arr[i-1]*nums[i-1]);
			
			}
		System.out.print(Arrays.toString(arr)+" ");

		int right =1;
		for(int i=n-1;i>=0;i--) {
			arr[i]=arr[i]*right;
			right=right*nums[i];
			
		}
		
				
		
		
		return arr;
	}
	

}
