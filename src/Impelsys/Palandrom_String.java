package Impelsys;

public class Palandrom_String {

	public static void main(String[] args) {
		String name = "malayalam";
		
		System.out.println(palandrom(name));
		
	}
	
	public static boolean palandrom(String name) {
		
		//boolean out = false;
		
		char[] ch = name.toCharArray();
		int s = 0;
		int l = ch.length-1;
		
		while(s<l) {
			if(ch[s]==ch[l]) {
				s++;
				l--;
			}
			else {
				return false;
			}	
		}
		return true;
		
		
			
	}

}
