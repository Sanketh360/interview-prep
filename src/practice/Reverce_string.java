package practice;

public class Reverce_string {
	
	public static void main(String [] args) {
		String str = "sanketh";
		reverce (str);
	}
	public static void reverce(String str) {
		//StringBuilder sb = new StringBuilder();
		//int len = str.length()-1;
		char [] single = str.toCharArray();
		int s = 0;
		int e = single.length-1;
		
		while(s<e) {
			char temp = single[s];
			single[s]=single[e];
			single[e]=temp;
			
     		s++;
			e--;
		}
		System.out.println(new String(single));	
	}

}
