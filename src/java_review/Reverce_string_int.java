package java_review;

public class Reverce_string_int {

	public static void main(String[] args) {
		String name  = "sanketh" ;
		int num = 12345;
		System.out.println(reverce(name));
		System.out.println(rev_num(num));

		

	}

	public static String reverce(String name) {
		
		char[] c = name.toCharArray();
		int f = 0;
		int l = c.length-1;
		while(f<l) {
			char temp = c[f];
			c[f]=c[l];
			c[l]=temp;
			f++;
			l--;	
		}
		return new String(c);
		
	}
	
	public static int rev_num(int num) {
		int temp = num;
		int ans = 0;
		while(temp != 0) {
			int take = temp%10;
			ans = ans * 10 +take;
			temp = temp / 10;
		}
		return ans;
		
	}
}
