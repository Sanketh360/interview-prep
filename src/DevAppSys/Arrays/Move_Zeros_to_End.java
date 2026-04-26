package DevAppSys.Arrays;

import java.util.Arrays;

public class Move_Zeros_to_End {

	public static void main(String[] args) {
		int arr[] = {0, 0 , 1, 0, 3,5, 12 ,0 ,0 , 3, 0 ,0,0,0,1};
		System.out.println(Arrays.toString(move(arr)));
		
	}
	
	public static int[]  move(int [] arr) {
		
		int index = 0;
		for(int  i = 1 ; i< arr.length ; i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
				arr[i]=0;
			}
		}
		return arr;
	
		
	}

}
