package java_review;

public class Check_Palindrome {

	public static void main(String[] args) {
		String name1="malayalam";
		String name2 = "noon";
		int num1 = 12221;
		int num2 =1331;
		
		System.out.println(palindrome(name1));
		System.out.println(palindrome_num(num1));
		
	

	}

	
	public static boolean palindrome(String name) {
		if(name.length()< 2) {
			return false;
		}
		char[] c = name.toCharArray();
		int f = 0 ; 
		int l = c.length-1;
		while(f<l) {
			if(c[f] == c[l]) {
				f++;
				l--;
			}
			else {
				return false;
			}
		}
		return true;
		
	}
	
	
	public static boolean palindrome_num(int num) {
		
		
		
		
		return false;
		
	}
}
