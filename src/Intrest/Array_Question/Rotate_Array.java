package Intrest.Array_Question;

import java.util.Arrays;

public class Rotate_Array {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,50};
		int k = 2;
		 int n = arr.length;
		    k = k % n;
		    System.out.println(k);

		    int[] temp = new int[n];

		    for (int i = 0; i < n; i++) {
		        temp[i] = arr[(i + k) % n];
		    }

		    System.out.println(Arrays.toString(temp));
	}

}
