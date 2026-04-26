package Intrest.String_Question;

public class Reverse_String {

	public static void main(String[] args) {
	String str = "sanketh";
	System.out.println(reverse(str));
//	System.out.println(reverse1(str));


	}
	public static String reverse(String str) {
		char [] c = str.toCharArray();
		int start = 0;
		int end = c.length-1;
		while(start != end) {
			char temp = c[start];
			c[start]=c[end];
			c[end]=temp;
			start ++;
			end --;
			
		}
		
		return new String(c);
		
	}
//	public static String reverse1(String str) {
//		int i = 0;
//		int j = str.length()-1;
//		
//		while(i < j) {
//			char start = str.charAt(i);
//			char end = str.charAt(j);
//			char temp = start;
//			start = end ;
//			end = temp;
//			i++;
//			j--;	
//		}
//		return str;
//		
//	}
	

}
