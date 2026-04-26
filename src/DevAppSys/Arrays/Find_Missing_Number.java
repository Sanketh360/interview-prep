package DevAppSys.Arrays;

public class Find_Missing_Number {

	public static void main(String[] args) {
		int []arr1 = {1,2,3,5,6};
		int []arr2 ={2,3,5,6,7};
		int []arr ={1,2,3,4,5};
		int n = 5;
		
		System.out.println(find(arr,n));
	}
	public static int find(int [] arr , int n) {
		if(arr[0]!=1) {
			return 1;
		}
		for(int i=1;i<n ; i++) {
			if(arr[i]-1!=arr[i-1]) {
				return arr[i]-1;
			}
		}
		return arr[n-1]+1;
		
	}

}
