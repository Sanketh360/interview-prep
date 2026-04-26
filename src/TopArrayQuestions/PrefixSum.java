package TopArrayQuestions;

import java.util.Arrays;

public class PrefixSum {

	public static void main(String[] args) {
		int [] arr = {5,4,2,6,3,1};
		System.out.println((prefix(arr)));

	}
   public static boolean prefix(int [] arr) {
	   int curr  = 0;
	   int s=0;
	   int e=arr.length-1;
	   int mid = s+(e-s)/2;
	   int n=arr.length;
	   int l=0;
	   
	   for(int i=0;i< n;i++) {
		  
		   curr= curr+arr[i];
		   arr[i]=curr;
		   if(i==mid) {
				l=arr[i];
				curr=0;
		   }
	   }
	   
//	   int x= 1;
//	   int y=3;
//	   System.out.println(x-y);
	   System.out.println(Arrays.toString(arr));

	   return l == curr;
	   
   }
}
