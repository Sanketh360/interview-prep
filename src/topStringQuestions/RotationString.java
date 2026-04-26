package topStringQuestions;

public class RotationString {

	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "BCDA";
		//boolean ans = 
		System.out.println(rotate(str1,str2));
	
	}
	public static boolean rotate(String s1,String s2) {
		String combine = s1+s1;
		return combine.contains(s2);
		
	}

}
