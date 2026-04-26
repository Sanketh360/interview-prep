package TopArrayQuestions;

import java.util.HashSet;

public class DuplicatElement {
	public static void main(String[] args) {
		int arr[]= {1,3,4,5,6,4,1};
		
	duplicat(arr);
		 
		 
	 }
	 public static void duplicat(int[] arr) {
		 HashSet<Integer> set = new HashSet<>();
		 for(int n: arr) {
			 if(!set.add(n)) {
				 System.out.println(n);
			 }
		 }
		
		 
	 }

}
