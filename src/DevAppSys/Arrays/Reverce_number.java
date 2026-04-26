package DevAppSys.Arrays;

public class Reverce_number {

	public static void main(String[] args) {
		int n = 123456;
		System.out.println(reverce(n));
		
	}
	
	public static int reverce(int n) {
		int sum= 0;
		
		while(n>0) {
			int temp = n%10;
			sum = sum*10+temp;
			n=n/10;
		}
		return sum;
	}

}
