package TopArrayQuestions;

public class SecondLargest {
	public static void main(String[] args) {
		int arr[]= {4,66,99,8,4,2,686,686,77,88};
		
	second(arr);
		 
		 
	 }
	 public static void second(int[] arr) {
		 int n = arr.length;
		 int max= arr[0],smax=arr[0];
		 for(int i=1;i<n;i++) {
			 if(arr[i]>max) {
				 smax=max;
				 max=arr[i];	 
			 } 
			 else if(arr[i]>smax && arr[i]!=max) {
				 smax=arr[i];
				 
			 }
			 
		 }
		 
		 System.out.println(smax);
		 
	 }
}
