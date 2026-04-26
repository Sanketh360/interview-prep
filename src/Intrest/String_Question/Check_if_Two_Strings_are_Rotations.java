package Intrest.String_Question;

public class Check_if_Two_Strings_are_Rotations {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "cdab";
		
		System.out.println(rotate(s1,s2));
	}
	
	public static 	boolean rotate(String s1 , String s2) {
		
		String temp = s1+s1;
		if(temp.contains(s2)) {
			return true;
		}
		
	
		return false;
		
	}

}
