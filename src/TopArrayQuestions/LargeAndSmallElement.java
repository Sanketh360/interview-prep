package TopArrayQuestions;

import java.util.Arrays;

public class LargeAndSmallElement {
	 public static void main(String[] args) {
		 int arr[]= {8,9,10,33,1};
		 
		 ls(arr);
	 }
	 public static void ls(int[] arr) {
		    int min = arr[0], max = arr[0];
		    
		    for(int i=1; i<arr.length; i++) {
		        if(arr[i] < min) {
		            min = arr[i];
		        }
		        if(arr[i] > max) {
		            max = arr[i];
		        }
		    }
		    
		    System.out.println("Min = " + min + ", Max = " + max);
		}


}
