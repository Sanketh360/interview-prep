package Intrest.String_Question;

public class Palindrome {

	public static void main(String[] args) {
		String s = "malayalam";
		System.out.println("The " + s + " is "+palandrom(s));
		
	}
	public static boolean palandrom(String s) {
		char[] c = s.toCharArray();
		int f = 0;
		int l = c.length-1;
		
		while(f<l) {
			if(c[f]!= c[l]) {
				return false;
			}
			f++;
			l--;
		}
		
		
		return true;
		
	}

}
