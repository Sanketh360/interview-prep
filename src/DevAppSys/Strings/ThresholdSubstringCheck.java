package DevAppSys.Strings;

import java.util.HashSet;

public class ThresholdSubstringCheck {
	
	public static void main(String[] args) {
        String s1 = "ACDEGXYABC";
        String s2 = "ABCDEGZWRY";
        int X = 4;

        System.out.println(checkSubstring(s1, s2, X)); // SUCCESS
    }
	

    public static String checkSubstring(String s1, String s2, int x) {
    	HashSet<String> set = new HashSet<>();
    	for(int i=0;i<=s1.length()-x;i++) {
    		set.add(s1.substring(i,i+x));
    		
    	}
    	
    	for(int i=0;i< s2.length()-x;i++) {
    		if(s1.contains(s2.subSequence(i, i+x))) {
    			return "SUCCESS";
    		}
    	}
    	
    	
    	
    	
		return "FLAS";
        
    }

    
}
