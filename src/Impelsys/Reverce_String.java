package Impelsys;

public class Reverce_String {

	public static void main(String[] args) {
		String name = "Impelsys";
		System.out.println(reverce(name));
	}
	
	public static String reverce(String name){
		char[] ch = name.toCharArray();
		int s = 0;
		int l = ch.length-1;
		
		while(s<l) {
			char temp = ch[s];
			ch[s] = ch[l];
			ch[l] = temp;
			s++;
			l--;	
		}
		return new String(ch);
	}
}
