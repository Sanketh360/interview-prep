package practice;

public class ReverceString {

	public static void main(String[] args) {
		String name = "CodeLabs";
		System.out.println(reverce(name));
		
		

	}
	
	public static String  reverce(String name) {
		char[] n = name.toCharArray();
		int f = 0;
		int l = n.length-1;
		while(f<l) {
			char temp = n[f];
			n[f]=n[l];
			n[l]=temp;
			f++;
			l--;
		}
		
		return new String(n);
		
		
		
	}
	
	
	public static String reverse2(String str) {
	    return new StringBuilder(str).reverse().toString();
	}

	

}
