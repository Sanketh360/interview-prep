package Intrest.Array_Question;
import java.util.*;

public class Move_Zeroes {

	public static void main(String[] args) {
		int[] arr = {0,0,0,0,0,0,2,0,0,0,0,0000001,0,0,00000,11};
		System.out.println(Arrays.toString(move(arr)));

	}
	public static int[] move(int[] arr) {
		int zero = 0;
		//int num = 0;
		
		for(int i = 1 ; i < arr.length ; i++) {
			if((arr[i]!=0 && arr[zero]==0 )) {
				arr[zero]=arr[i];
				zero++;
				arr[i]=0;
				
			}
			else {
				if(arr[zero]!=0) {
					zero++;
				}
			}
		
		
		}
		return arr;
		
	}

}
