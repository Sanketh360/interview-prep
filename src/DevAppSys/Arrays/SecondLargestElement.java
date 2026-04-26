package DevAppSys.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,88,58,64};
		System.out.println(slarg(arr));

	}
	public static int slarg(int [] arr) {
		int max = Integer.MIN_VALUE;
		
		int smax =Integer.MIN_VALUE;
		
		for(int i= 0;i<arr.length;i++) {
			if(arr[i]>max) {
				smax = max;
				max = arr[i];	
			}
			else if(arr[i]>smax && arr[i]!=max) {
				smax = arr[i];
			}
			
		}
		return smax;
		
	}

}
