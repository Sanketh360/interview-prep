package TopArrayQuestions;

import java.util.Arrays;

public class MoveZero {

	public static void main(String[] args) {
		int arr[]= {0,0, 1, 0,0, 3, 0,12,55};
		
	move(arr);	 
	 }
	 public static void move(int[] arr) {
		 int m= 0;
		 int n  = arr.length;
		 
		 for(int i= 0;i<n;i++) {
			 if(arr[i]!=0) {
				 arr[m]=arr[i];
				 arr[i]=0;
				 m++;
			 }
			 
			 //System.out.println(Arrays.toString(arr));
			 
		 }
		 
		 System.out.println(Arrays.toString(arr));
		 
	 }
}
