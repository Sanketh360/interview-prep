package Impelsys;

public class Find_Missing_Number {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8};
		System.out.println(miss(arr));
		
		
 
	}
	
	public static int miss(int [] arr) {
		
		for(int i = 1 ; i< arr.length ; i++) {
			if(arr[i]!=arr[i-1]+1) {
				return arr[i-1]+1;
			}
		}
		return arr[0]-1;
		
	}

}
