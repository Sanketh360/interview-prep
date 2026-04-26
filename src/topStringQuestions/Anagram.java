package topStringQuestions;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

	 boolean c= anagram(str1,str2);
		System.out.println(c);

	}
	public static boolean anagram(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		char []st1=s1.toCharArray();
		char []st2=s2.toCharArray();
		
		Arrays.sort(st1);
		Arrays.sort(st2);
		
		if(Arrays.equals(st1 ,st2)) {
			return true;
		}

       return false;
		
		
		
	}

}
