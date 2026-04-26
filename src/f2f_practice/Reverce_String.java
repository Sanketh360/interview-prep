package f2f_practice;

public class Reverce_String {

	public static void main(String[] args) {
		
		 String name = "Sanketh";
		 
		System.out.println(reverce(name)); 

	}
	
	public static String reverce(String name) {
		
		char [] ch = name.toCharArray();
		
	 int f = 0;
	 int l = ch.length-1;
	 
	 while(f<l) {
		 char temp = ch[f];
		 ch[f]=ch[l];
		 ch[l]=temp;
		 f++;
		 l--;
	 }
		
		
		return new String(ch);
		
		
	}

}
