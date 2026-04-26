package TopArrayQuestions;

public class SlidingWindow {
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 7, 5};
		int k=3;
		
		
	int ans = window(arr,k);
	System.out.println(ans);
	 }
	 public static int window(int[] arr,int k) {
		 int windowmax = 0;
		 int max= 0;
		  for(int i=0;i<k;i++ ) {
			  windowmax+=arr[i];
		  }
		  
		  max = windowmax;
		  
		  
		  for(int i=k;i<arr.length-1;i++) {
			  windowmax = windowmax-arr[i-k]+arr[i];
			  max=Math.max(max, windowmax);
			  
		  }
		  
		  return max;
		 
	 }

}
