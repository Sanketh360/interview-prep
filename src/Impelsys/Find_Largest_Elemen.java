package Impelsys;

public class Find_Largest_Elemen {

	public static void main(String[] args) {
		int[] arr = {5,6,88,33,222,34,98};
		
		System.out.println(large(arr));
	}
	
	public static int large(int[] arr) {
		
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		
		}
		
		
		
		return max;
		
	}

}
