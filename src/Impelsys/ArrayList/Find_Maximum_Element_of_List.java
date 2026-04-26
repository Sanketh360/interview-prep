package Impelsys.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_Maximum_Element_of_List {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,77},{4,5,6},{7,8,9,1,66}};
		
		System.out.println(Arrays.toString(max(arr)));
	}

	public static int[] max(int[][] arr) {
		ArrayList<ArrayList> list = new ArrayList<>();
		
		for(int i = 0 ; i<arr.length ;i++) {
			ArrayList<Integer> row = new ArrayList<>();
			for(int j =0 ; j<arr[i].length ;j++) {
				row.add(arr[i][j]);
			}
		list.add(row);
		}
		int [] out = new int[arr.length];
		int i=0; 
		for(ArrayList<Integer> row : list) {
			int max = row.get(0);
			for(int ans : row) {
				if(ans > max)
					max=ans ;
			}
			out[i] = max;
			i++;	
		}
		return out;
		
	}
}
