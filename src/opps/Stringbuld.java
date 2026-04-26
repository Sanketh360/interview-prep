package opps;

public class Stringbuld {
	public static void main(String [] args) {
	String str = "hello how are boys   ";
	
	lengthOfLastWord(str);
	int ans =lengthOfLastWord(str);
	System.out.println(ans);
	
	}
	
	public static int  lengthOfLastWord(String str) {
 
	StringBuilder sb = new StringBuilder(str);
	int i = sb.length()-1;
	int length=0;
	
	while(i>=0 && sb.charAt(i) == ' ') {
		i--;	
	}
	
	while(i>=0 && sb.charAt(i)!=' ') {
		length++;
		i--;
		
	}
	return length;
	
	
	}

}
