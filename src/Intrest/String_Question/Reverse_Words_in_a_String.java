package Intrest.String_Question;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		String str = "Java developer interview";
		System.out.println(reverce(str));
	}
	
	public static String reverce(String s) {
		
		String[] str = s.trim().split("\\s+");
		int f = 0;
		int l = str.length-1;
		while(f<l) {
			String temp = str[f];
			str[f]=str[l];
			str[l]=temp;
			f++;
			l--;
		}
		
		
		return String.join(" ", str);
		
	}

}
