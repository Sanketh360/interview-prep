package Cognizent;

public class sliding {

	public static void main(String[] args) {
		int n= 8;
		int [] arr = {1,2,1,3,5,2,4,2};
		System.out.println(window (arr));
	}
	public static int window(int[] arr) {
		int count =0;
		 for(int i=0;i<arr.length-2;i++) {
			 if(arr[i]+arr[i+2]==arr[i+1]) {
				 count++;
			 }
			 
			 
		 }
		return count;
	}

}
