package Intrest.String_Question;

public class String_to_Integer_Conversion {

	public static void main(String[] args) {
		String s = "      -72    89         ";
		System.out.println(convert(s));

	}
	
	public static int convert(String s) {
		
		int i = 0 ; int sign = 0 ; int result = 0 	;
		s= s.trim().replaceAll(" ","");
		
		while (i<s.length() && s.charAt(i) == ' ') {
			i++;
		}
		if(i<s.length()&&(s.charAt(i)== '+' || s.charAt(i) == '-')) {
			sign = (s.charAt(i)== '-')? -1 : 1;
			i++;
		}
		
		while(i<s.length() && Character.isDigit(s.charAt(i))) {
		  int digit = s.charAt(i)- '0';
			result = result * 10 + digit;
			i++;
		}
		
		result = result*sign;
		
		
		
		return result;
		
	}	
		
	}

	
