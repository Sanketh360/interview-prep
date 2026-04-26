package ITC_Question;

public class array {
	public static void main(String[] args) {
    int [] arr = {1,2,3,4};
	int n=4;
	int k=3;
	
	swap(arr,0,k-1,n);
	swap(arr,1,n-1,n);
	
	for(int i = 0; i<n ; i++) {
		System.out.print(arr[i]+" ");
	}
	
}
	public static int[] swap(int[] arr,int min,int max,int n) {
		while(min<max) {
			int temp = arr[min];
			arr[min] = arr[max];
			arr[max]=temp;
			min++;
			max--;
		}
		return arr;
		
	}
}
