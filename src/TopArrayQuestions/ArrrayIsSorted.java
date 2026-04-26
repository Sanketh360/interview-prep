package TopArrayQuestions;

public class ArrrayIsSorted {

	public static void main(String[] args) {
		int arr[]= {1,2,2,2,2,4,3,4,5};
		
		boolean ans = issorted(arr);
		 
		 System.out.println(ans);
	 }
	 public static boolean issorted(int[] arr) {
		 int n=arr.length;
		 int s=0;
		 int e=	 n-1;
		 boolean ans =true;
		 for(int i=1;i<n;i++) {
			 if(arr[i]<arr[i-1]) {
				 ans = false;
				 break;	 
			 }
			 
		 }
		 return ans;
		  
	}

}
