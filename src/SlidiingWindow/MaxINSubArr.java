package SlidiingWindow;

public class MaxINSubArr {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7};
		int k=3;
		
		int ans =subarr(arr,k);
		System.out.println(ans);

	}
	
	public static int subarr(int [] arr,int k) {
		int n=arr.length-1;
		if(n<k) {
			System.out.println("Error");
			return -1;
			
		}
		int window=0;
		for(int i=0;i<k;i++) {
			window+=arr[i];
		}
		int max=window;
		
		for(int i=k;i<=n;i++) {
			window+=arr[i]-arr[i-k];
			max=Math.max(window,max);
			//System.out.println(max);
		}
		
		return max;
	}

}
