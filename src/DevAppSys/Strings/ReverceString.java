package DevAppSys.Strings;

public class ReverceString {

	public static void main(String[] args) {
		String name = "DevAppSys";
		System.out.println(reverce(name));
	}
	public static String reverce(String name) {
		char[] c = name.toCharArray();
		int f = 0;
		int l = c.length-1;
		while(f<l) {
			char temp = c[f];
			c[f] = c[l];
			c[l]=temp;
			f++;
			l--;
		}
		return new String(c);
			
	}
	

}
