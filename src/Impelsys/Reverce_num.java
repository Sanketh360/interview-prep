package Impelsys;

public class Reverce_num {

	public static void main(String[] args) {
		int num = 12345678;
		System.out.println(reverce(num));
	}
	
	public static int reverce(int num) {
		int ans=0;
		while(num!=0 || num<0) {
			int temp = num%10;
			ans = ans*10+temp;
			num=num/10;	
		}
		return ans;
	}

}
