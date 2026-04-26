package Impelsys;

public class Count_Wordes {

	public static void main(String[] args) {
		String name = "   I   Love Java       more   ";
		System.out.println(count(name));
		System.out.println(count1(name));
		System.out.println(count2(name));
	}

	public static int count(String name) {
		char [] arr = name.toCharArray();
		int count = 0;
		for(char n : arr) {
			if(n == ' ') {
				count ++;
			}
		}
		return count+1;	
	}
	
	public static int count1(String name) {
		
		String [] arr = name.trim().split("\\s+");
		
		int count =0;
		for(String n : arr) {
			count ++;
		}
		return count;	
	}
	
	
	
public static int count2(String name) {
		int count = 0;
	 boolean word = false;
	 for(char c : name.toCharArray()) {
		 if(c!=' ' && !word) {
			 count++;
			 word=true;
		 }
		 else if(c==' ') {
			 word = false;
			 }
	 } 
	return count;	
	}
}
