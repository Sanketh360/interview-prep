package DevAppSys.Arrays;

public class Kadanes_Algorithm {

	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4	};
		System.out.println(kad(arr));
	}
	
	public static int kad(int[] arr) {
		
		int sum = arr[0];
		int curr = arr[0];
		
		for(int i=1;i<arr.length;i++) {
		
			curr = Math.max(arr[i], curr+arr[i]);
			sum = Math.max(sum, curr);
			
		}
		return sum;
		
	}

}
