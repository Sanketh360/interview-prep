package DevAppSys.Arrays;

public class MaxPresent {

	public static void main(String[] args) {
		 int[] at = {1, 0, 0, 1,1};
		System.out.println(present(at));
	}
	public static int present(int[] arr) {
		
		int max = 0;
		int count = 0;
		
		for(int i = 0; i< arr.length;i++) {
			if(arr[i]==1) {
				count++;
				max = Math.max(max,count);
			}
			else {
				count=0;
			}
		}
		
		
		return max;
		
	}

}
