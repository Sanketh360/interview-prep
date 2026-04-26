package Test;

public class SecondMaxArray {
	public static void main(String []args) {
		int arr[]= {33,4,0};
		Max(arr);
		
	}
	public static void Max(int[]arr) {
		int first;
		int second;
		int n=0;
		if(arr[0]>arr[1]) {
			first=arr[1];
			second = arr[0];
			if(arr.length==2) {
				System.out.println("Array contain 2 element only");
				return;
			}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>first) {
				second = first;
				first = arr[i];
				
			}
			 else if (arr[i]<first && arr[i]!=first){
				second=arr[i];
				
				
			}
		}
		n=second;
	}
		System.out.println(n);

}
}
