package Intrest.Array_Question;

public class Single_Number {

	public static void main(String[] args) {
		int[] arr = {3,9,3,4,4,9,1};
		int sum = 0;
		for(int a:arr) {
			sum^=a;
		}
		System.out.println(sum);

	}

}
