package DevAppSys.Strings;

import java.util.HashSet;

public class CheatingOK {

	public static void main(String[] args) {
	String s1 = "ABCDABCDABCD";
	String s2 = "ABcTRCDABCUK";
	int num = 5;
	System.out.println(status(s1,s2,num));

	}
	
	public static String status(String s1 , String s2  , int num) {
		
	HashSet<String> set = new HashSet<>();
	
	for(int i = 0 ; i< s1.length()-num;i++) {
		String curr = s1.substring(i, i+num);
		set.add(curr);
		
	}
	
	   for (int i = 0; i <= s2.length() - num; i++) {
           String curr = s2.substring(i, i + num);
           if (set.contains(curr)) {
               return "Cheating";
           }
       }
		
		
		return "ok";
		
	}

}
